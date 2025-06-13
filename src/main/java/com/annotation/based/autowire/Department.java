package com.annotation.based.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {

    private int departmentId;
    @Value("Executives")
    private String  name;
    @Value("Board")
    private String type;
    @Autowired // This is field based dependency injection using autowired annotation
    private Employee employee;

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", employee=" + employee +
                '}';
    }
}
