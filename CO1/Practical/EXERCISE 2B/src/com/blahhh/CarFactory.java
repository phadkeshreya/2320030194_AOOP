package com.blahhh;

public class CarFactory implements VehicleFactory {
	public Vehicle createVehicle() {
        return new Car();
    }
}
