package com.annotation.based.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

    private int employeeId;
    @Value("Neeta")
    private String name;
    @Value("#{4000*2}")
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
