package com.ioc.loose.coupling;

public class UserDBProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        return "UserDBProvider User Details";
    }

}
