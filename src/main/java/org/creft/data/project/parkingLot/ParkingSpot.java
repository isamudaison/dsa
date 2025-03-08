package org.creft.data.project.parkingLot;

public class ParkingSpot {

    private Vehicle vehicle;
    private VehicleType spotType;

    public ParkingSpot(VehicleType type) {
        this.spotType = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return this.isAvailable() &&
                ( (vehicle.type == this.spotType)
                ||
                (vehicle.type == VehicleType.MOTORCYCLE && this.spotType == VehicleType.CAR)
                ||
                (vehicle.type == VehicleType.MOTORCYCLE && this.spotType == VehicleType.VAN)
                ||
                (vehicle.type == VehicleType.CAR && this.spotType == VehicleType.VAN) )
                ||
                (vehicle.type == VehicleType.VAN && this.spotType == VehicleType.CAR);
    }

    public void parkVehicle(Vehicle v){
        if(this.canFitVehicle(v))
            this.vehicle = v;
    }

    public void leave(){
        this.vehicle = null;
    }
}
