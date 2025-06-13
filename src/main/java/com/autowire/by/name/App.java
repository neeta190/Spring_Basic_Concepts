package com.autowire.by.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationAutowireContext.xml");

        Car car = (Car)context.getBean("myCar");
        System.out.println("My Car Details : " + car.displayCarSpecification());
    }
}
