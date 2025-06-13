package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationInjectionContext.xml");

        Car car = (Car)context.getBean("myCar1");
        System.out.println("My Car Details : " + car.displayCarSpecification());
    }
}
