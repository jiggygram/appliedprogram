package com.vehicle;

public class ElectricCar extends Car{
    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
        Car myCar = new Car();
    }

    @Override
    public void drive(int value) {
        super.drive(value);
        if (getDistanceKm() % 10 == 0){
            batteryLevel = -1;
        }
    }

    private double batteryLevel;
}




