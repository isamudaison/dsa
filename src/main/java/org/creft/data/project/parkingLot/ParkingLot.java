package org.creft.data.project.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingSpot> motorcycleSpots;
    private final List<ParkingSpot> carSpots;
    private final List<ParkingSpot> largeSpots;

    public ParkingLot(int motoSpots, int carSpots, int largeSpots) {
        this.motorcycleSpots = new ArrayList<>(motoSpots);
        this.carSpots = new ArrayList<>(carSpots);
        this.largeSpots = new ArrayList<>(largeSpots);

        for(int i = 0; i < motoSpots; i++)
            this.motorcycleSpots.add(new ParkingSpot(VehicleType.MOTORCYCLE));
        for(int i = 0; i < carSpots; i++)
            this.carSpots.add(new ParkingSpot(VehicleType.CAR));
        for(int i = 0; i < largeSpots; i++)
            this.largeSpots.add(new ParkingSpot(VehicleType.VAN));
    }

    public int getTotalSpots(){
        return this.motorcycleSpots.size() + this.carSpots.size() + this.largeSpots.size();
    }

    public boolean isFull(){
        return this.availableSpots() == 0;
    }

    public boolean isEmpty(){
        return this.getTotalSpots() == this.availableSpots();
    }

    public int availableSpots(){
        int availableMotoSpots = (int)this.motorcycleSpots.stream().filter(ParkingSpot::isAvailable).count();
        int availableCarSpots = (int)this.carSpots.stream().filter(ParkingSpot::isAvailable).count();
        int availableLargeSpots = (int)this.largeSpots.stream().filter(ParkingSpot::isAvailable).count();

        return availableLargeSpots+availableCarSpots+availableMotoSpots;
    }

    public boolean parkVehicle(Vehicle v){
        if(!this.isFull()) {
            return switch (v.type) {
                case MOTORCYCLE -> parkMotorcycle(v);
                case CAR -> parkCar(v);
                case VAN -> parkVan(v);
            };
        }
        return false;
    }

    private boolean parkMotorcycle(Vehicle v) {
        return parkInAvailableSpot(v, this.motorcycleSpots) || parkInAvailableSpot(v, this.carSpots) || parkInAvailableSpot(v, this.largeSpots);
    }

    private boolean parkCar(Vehicle v) {
        return parkInAvailableSpot(v, this.carSpots) || parkInAvailableSpot(v, this.largeSpots);
    }

    private boolean parkVan(Vehicle v) {
        if(parkInAvailableSpot(v, this.largeSpots))
            return true;

        //try other, 'smaller' spots
        // van takes up 3 'car' spots
        int count = 0;
        List<ParkingSpot> allocatedSpots = new ArrayList<>();
        for(ParkingSpot spot : this.carSpots){
            if(spot.isAvailable()){
                allocatedSpots.add(spot);
                count++;
                if(count == v.getSpotsNeeded()){
                    for(ParkingSpot splitSpot: allocatedSpots){
                        splitSpot.parkVehicle(v);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int countSpotsTaken(VehicleType v){
        return switch (v) {
            case MOTORCYCLE -> (int) this.motorcycleSpots.stream().filter(s -> !s.isAvailable()).count();
            case CAR -> (int) this.carSpots.stream().filter(s -> !s.isAvailable()).count();
            case VAN -> (int) this.largeSpots.stream().filter(s -> !s.isAvailable()).count() + ((int)this.carSpots.stream().filter(s -> s.getVehicle() != null).filter(s -> s.getVehicle().type == VehicleType.VAN).count()/3);
        };
    }

    private boolean parkInAvailableSpot(Vehicle v, List<ParkingSpot> spots){
        for(ParkingSpot spot : spots){
            if(spot.isAvailable() && spot.canFitVehicle(v)) {
                spot.parkVehicle(v);
                return true;
            }
        }
        return false;
    }
}
