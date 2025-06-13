package com.annotation.based.qualifier;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{

    private double speed;
    private boolean isEngineOn;

    @Override
    public void start() {
        speed = 50.00;
        isEngineOn = true;
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        isEngineOn = false;
        speed = 0.0;
        System.out.println("Car has stopped");
    }
}
