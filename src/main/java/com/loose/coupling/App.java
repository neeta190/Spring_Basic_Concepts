package com.loose.coupling;

public class App {

    public static void main(String[] args){

        UserDBProvider userDBProvider = new UserDBProvider();
        UserManager userManagerDBProvider = new UserManager(userDBProvider);
        System.out.println(userManagerDBProvider.getUserInfo());

        NewDBUserDataProvider newDBProvider = new NewDBUserDataProvider();
        UserManager userManagerNewDBUserDataProvider = new UserManager(newDBProvider);
        System.out.println(userManagerNewDBUserDataProvider.getUserInfo());

        WebServiceUserDataProvider webServiceProvider = new WebServiceUserDataProvider();
        UserManager userManagerWebServiceUserDataProvider = new UserManager(webServiceProvider);
        System.out.println(userManagerWebServiceUserDataProvider.getUserInfo());

    }
}
