package com.example.SpringPractice.PojoPractice;

import java.util.ArrayList;
import java.util.List;

public class CarController {

    public static List<Car> getCars() {
        List <Car> carList = new ArrayList<Car>();
        Car c1 = new Car();
        c1.setMake("Ferrai");
        c1.setModel("488");
        c1.setYear("2020");

        Car c2 = new Car();
        c2.setMake("Ford");
        c2.setModel("GT40");
        c2.setYear("1969");

        Car c3 = new Car();
        c3.setMake("Dodge");
        c3.setModel("Challenger");
        c3.setYear("2021");

        carList.add(c1);
        carList.add(c2);
        carList.add(c3);

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
        return null;
    }
}
