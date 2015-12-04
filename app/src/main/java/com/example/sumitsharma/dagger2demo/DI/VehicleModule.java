package com.example.sumitsharma.dagger2demo.DI;

import android.content.Context;

import com.example.sumitsharma.dagger2demo.Model.Motor;
import com.example.sumitsharma.dagger2demo.Model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sumitsharma on 04/12/15.
 */
@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }


    @Provides
    @Singleton
    Vehicle provideVehicle(Motor motor){
        return new Vehicle(motor);
    }

}

