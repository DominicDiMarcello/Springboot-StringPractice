package com.example.SpringPractice.PojoPractice;

public class Car {

    private String make;
    private String model;
    private String year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "\nMake: " + make + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year;
    }
}
