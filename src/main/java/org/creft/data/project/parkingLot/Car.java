package org.creft.data.project.parkingLot;

public class Car extends Vehicle{
    public Car() {
        super.spotsNeeded = 1;
        super.type = VehicleType.CAR;
    }
}
