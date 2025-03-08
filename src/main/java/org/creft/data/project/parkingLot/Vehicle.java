package org.creft.data.project.parkingLot;

public abstract class Vehicle {
    protected VehicleType type;
    protected int spotsNeeded;

    public VehicleType getType() {
        return type;
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }
}
