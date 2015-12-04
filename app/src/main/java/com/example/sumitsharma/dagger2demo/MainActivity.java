package com.example.sumitsharma.dagger2demo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.sumitsharma.dagger2demo.DI.DaggerVehicleComponent;
import com.example.sumitsharma.dagger2demo.DI.VehicleComponent;
import com.example.sumitsharma.dagger2demo.DI.VehicleModule;
import com.example.sumitsharma.dagger2demo.Model.Motor;
import com.example.sumitsharma.dagger2demo.Model.Vehicle;

import javax.inject.Inject;

public class MainActivity extends ActionBarActivity {

    @Inject
    Vehicle vehicle;
    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        component.inject(this);

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, String.valueOf(motor.getRpm()), Toast.LENGTH_LONG).show();

    }
}