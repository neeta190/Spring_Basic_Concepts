package com.annotation.based.qualifier;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{
    private double speed;
    private boolean isEngineOn;

    @Override
    public void start() {
        isEngineOn = true;
        speed = 40.00;
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        isEngineOn = false;
        speed = 0.00;
        System.out.println("Car has stopped");
    }
}
