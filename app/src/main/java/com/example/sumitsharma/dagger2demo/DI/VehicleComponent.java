package com.example.sumitsharma.dagger2demo.DI;

import com.example.sumitsharma.dagger2demo.MainActivity;
import com.example.sumitsharma.dagger2demo.Model.Motor;
import com.example.sumitsharma.dagger2demo.Model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sumitsharma on 04/12/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    void inject(MainActivity activity);

}