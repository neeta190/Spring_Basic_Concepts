package com.autowire.by.name;

public class Car {

    // Bean property name in the class and the applicationContext should be same
    private Specification carSpecification;

    public void setCarSpecification(Specification specification) {
        this.carSpecification = specification;
    }

    public String displayCarSpecification(){
        return carSpecification.toString();
    }
}
