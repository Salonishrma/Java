package com.example.car;

public class Engine {
    private int horsePower;
    public Engine(int horsePower){
        this.horsePower=horsePower;
    }
    public void start(){
        System.out.println("Engine horse power "+ horsePower);
        
    }
}
