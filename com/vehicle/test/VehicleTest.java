package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        ElectricCar myElectricCar = new ElectricCar();

        myCar.setSpeedKph(72.2);
        myCar.setFuelLevel(85.5f);
        myElectricCar.setSpeedKph(91.9);
        myElectricCar.setFuelLevel(99.05f);
        myElectricCar.setBatteryLevel(100);
        myCar.drive(5000); // this is considered as 5 kilometers
        myElectricCar.drive(20000); // this is 20 kilometers

        System.out.println("The speed of the Car in mph is :" + myCar.getSpeedMph());
        System.out.println("The distance traveled by the car in Km is: " + myCar.getDistanceKm());
        System.out.println("The remaining Fuel in % is: " + myCar.calculateRemainingFuel(10));


        System.out.println("The ElectricCar Speed in mph is :" + myElectricCar.getSpeedMph());
        System.out.println("The ElectricCar Distance in km is :" + myElectricCar.getDistanceKm());
        System.out.println("The ElectricCar Remaining Fuel in % :" + myElectricCar.calculateRemainingFuel(5));
        System.out.println("The ElectricCar Battery Level in % : " + myElectricCar.getBatteryLevel());
    }
}
