package com.setter.injection;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String displayCarSpecification(){
        return specification.toString();
    }
}
