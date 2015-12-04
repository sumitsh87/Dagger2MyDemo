package com.example.sumitsharma.dagger2demo.Model;

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 20;
    }

    public Motor(int rpm){
        this.rpm = rpm;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}