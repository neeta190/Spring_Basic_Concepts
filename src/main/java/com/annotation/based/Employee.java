package com.annotation.based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

    private int employeeId;
    @Value("Neeta")
    private String name;
    @Value("Executives")
    private String department;
    @Value("#{4000*2}")
    private double salary;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
