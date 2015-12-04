package com.example.sumitsharma.dagger2demo.Model;

import javax.inject.Inject;

/**
 * Created by sumitsharma on 04/12/15.
 */

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm()*2;
    }
}