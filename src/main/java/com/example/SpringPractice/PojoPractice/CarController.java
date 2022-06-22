package com.example.SpringPractice.PojoPractice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarController {

    @RequestMapping(value = "/Cars", method = RequestMethod.GET)
    public static List<Car> getCars(Car car) {
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
