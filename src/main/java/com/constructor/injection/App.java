package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationInjectionContext.xml");

        Car car = (Car)context.getBean("myCar");
        System.out.println("Car Details : " + car.displayCarSpecification());
    }
}
