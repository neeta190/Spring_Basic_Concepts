package com.annotation.based.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private Vehicle vehicle;

    @Autowired
    public VehicleService(@Qualifier("car") Vehicle vehicle) {// Here Vehicle of type car is injected because of Qualifier annotation
        this.vehicle = vehicle;
    }

    public void printVehicleIgnition(){
        vehicle.start();
        vehicle.stop();
    }
}
