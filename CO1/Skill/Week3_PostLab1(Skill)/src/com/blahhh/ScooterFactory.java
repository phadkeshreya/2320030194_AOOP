package com.blahhh;

public class ScooterFactory implements VehicleFactory {
	public Vehicle createVehicle() {
        return new Scooter();
    }
}
