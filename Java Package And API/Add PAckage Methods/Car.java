package com.example.car;

public class Car {
    private String make;
    private String model;
    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }
    public void displayinfo(){
        System.out.println("MAke "+ make);
        System.out.println("MODEl "+ model);
    }
}
