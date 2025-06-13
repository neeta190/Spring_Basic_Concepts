package com.autowire.by.type;

public class Car {

    // Bean property type in the class and the applicationContext should be same
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String displayCarSpecification(){
        return specification.toString();
    }
}
