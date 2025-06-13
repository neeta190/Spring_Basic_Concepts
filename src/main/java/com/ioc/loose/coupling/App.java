package com.ioc.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocCouplingContext.xml");

        UserManager userManagerDBProvider = (UserManager) context.getBean("userManagerUserDBProvider");
        System.out.println(userManagerDBProvider.getUserInfo());


        UserManager userManagerNewDBUserDataProvider = (UserManager) context.getBean("userManagerNewDBProvider");
        System.out.println(userManagerNewDBUserDataProvider.getUserInfo());


        UserManager userManagerWebServiceUserDataProvider = (UserManager) context.getBean("userManagerWebDataProvider");
        System.out.println(userManagerWebServiceUserDataProvider.getUserInfo());

    }
}
