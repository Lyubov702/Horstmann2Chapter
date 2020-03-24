package com.myExample.car;

   /*   Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
        Provide methods to drive by a given number of miles, to add a given number of gallons to the gas tank,
        and to get the current distance from the origin and fuel level. Specify the fuel efficiency (in miles/gallons)
        in the constructor.*/

public class Car {

    private double x;
    private int gas;
    private double fuelEfficiency; //(miles/gallons)

    public Car(double fuelEfficiency) {
        this.x = 0;
        this.gas = 0;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(double distance) {
        gas -= distance / fuelEfficiency;
        if (gas <= 0) System.out.println("Not enough gas in the tank");
        else x += distance;
    }

    public void addGallons(int gallons) {
        this.gas+=gallons;
    }

    public double getCurrentDistance(){
        return fuelEfficiency*gas;
    }

    public double getX() {
        return x;
    }

    public int getGas() {
        return gas;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public String toString() {
        return "Car(" +
                "distance=" + x +
                ", gas=" + gas +
                ", fuelEfficiency=" + fuelEfficiency +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getX(), getX()) == 0 &&
                getGas() == car.getGas() &&
                Double.compare(car.getFuelEfficiency(), getFuelEfficiency()) == 0;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = (int) (31*result+Double.doubleToLongBits(x));
        result = 31*result+gas;
        result = (int) (31*result+Double.doubleToLongBits(fuelEfficiency));
        return result;
    }
}
