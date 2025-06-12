package com.constructor.injection;

public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }
    public String displayCarSpecification(){
        return specification.toString();
    }
}
