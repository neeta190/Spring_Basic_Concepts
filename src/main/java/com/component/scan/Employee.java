package com.component.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// If the value is specified in the component annotation the spring will try to find the bean with "employee" else
// the name of the class with first letter lower case e.g. "employee"
@Component("employee1")
public class Employee {

    private int employee_id;
    @Value("BMW")
    private String name;
    @Value("${java.home}")
    private String department;
    @Value("#{200*2}")
    private double salary;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
