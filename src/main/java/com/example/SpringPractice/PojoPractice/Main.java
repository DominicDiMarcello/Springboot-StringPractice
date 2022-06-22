package com.example.SpringPractice.PojoPractice;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("McLaren");
        car.setModel("570S Spider");
        car.setYear("2022");

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        CarController.getCars();

    }
}
