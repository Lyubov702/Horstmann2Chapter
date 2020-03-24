package com.myExample;

import com.myExample.car.Car;
import com.myExample.point.Point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point();
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        Car car = new Car(44);
        car.addGallons(50);
        System.out.println(car.getCurrentDistance());
        car.drive(100);
        System.out.println(car);
        System.out.println(car.getCurrentDistance());










    }


}
