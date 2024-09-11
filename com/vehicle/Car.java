package com.vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getSpeedKph() {
        return speedKph;
    }

    public void setSpeedKph(double speedKph) {
        this.speedKph = speedKph;
    }

    private int distanceTraveled;

    public void drive(int distance){
        this.distanceTraveled = + distance;
    }
    public double getSpeedMph(){
        return speedKph / 1.60934;
    }
    public int getDistanceKm(){
        return (int) distanceTraveled / 1000; //this to convert meter to kilometer
    }
    public int calculateRemainingFuel(double distance){
        double fuelConsumed = (distance / 1000) * 0.5;
        return (int) (fuelLevel-fuelConsumed);
    }
}
