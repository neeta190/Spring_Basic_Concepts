package com.ioc.loose.coupling;

public class NewDBUserDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "NewDBUserDataProvider User Details";
    }
}