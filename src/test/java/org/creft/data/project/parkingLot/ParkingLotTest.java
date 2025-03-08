package org.creft.data.project.parkingLot;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    ParkingLot parkingLot;

    Vehicle moto1 = new Motorcycle();
    Vehicle moto2 = new Motorcycle();
    Vehicle moto3 = new Motorcycle();

    Vehicle car1 = new Car();
    Vehicle car2 = new Car();
    Vehicle car3 = new Car();


    Vehicle van1 = new Van();
    Vehicle van2= new Van();
    Vehicle van3 = new Van();

    @BeforeEach
    void setUp() {
        parkingLot = new ParkingLot(3,3,1);


    }

    @AfterEach
    void tearDown() {

        this.parkingLot = null;
    }

    @Test
    void getTotalSpots() {
        assertEquals(7, this.parkingLot.availableSpots(), "Expected total spots to match");
    }

    @Test
    void isFull() {
        assertFalse(this.parkingLot.isFull(), "Expected lot to not be full.");
        this.parkingLot.parkVehicle(moto1);
        this.parkingLot.parkVehicle(moto2);
        this.parkingLot.parkVehicle(moto3);
        this.parkingLot.parkVehicle(car1);
        this.parkingLot.parkVehicle(car2);
        this.parkingLot.parkVehicle(car3);
        this.parkingLot.parkVehicle(van1);
        assertTrue(this.parkingLot.isFull(), "Expected lot to be full");
    }

    @Test
    void isEmpty() {
        assertTrue(this.parkingLot.isEmpty(), "Expected lot to be empty");
        this.parkingLot.parkVehicle(car1);
        assertFalse(this.parkingLot.isEmpty(), "Expected lot to not be empty");
    }

    @Test
    void availableSpots() {

        assertEquals(7, this.parkingLot.availableSpots(), "Expected 6 available spots");
        this.parkingLot.parkVehicle(van1);
        assertEquals(6, this.parkingLot.availableSpots(), "Expected 5 available spots");
    }

    @Test
    void parkVehicle() {

        this.parkingLot.parkVehicle(moto1);

        assertEquals(6, this.parkingLot.availableSpots(), "Expected 5 available spots");
        assertFalse(this.parkingLot.isEmpty(), "Should not be empty after parking a car");
    }

    @Test
    void countSpotsTaken() {

        assertTrue(this.parkingLot.parkVehicle(van1), "Expectd to park a van");
        assertEquals(1, this.parkingLot.countSpotsTaken(VehicleType.VAN), "Expected 1 van type");

        assertTrue(this.parkingLot.parkVehicle(van2), "Expected to be able to park a second van");
        assertEquals(2, this.parkingLot.countSpotsTaken(VehicleType.VAN), "Expected 2 van types");
    }
}