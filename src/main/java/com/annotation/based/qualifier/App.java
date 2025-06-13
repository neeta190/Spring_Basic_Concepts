package com.annotation.based.qualifier;

import com.annotation.based.autowire.Department;
import com.annotation.based.autowire.Employee;
import com.annotation.based.autowire.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleService vehicleService = context.getBean("vehicleService", VehicleService.class);
        vehicleService.printVehicleIgnition();


    }
}
