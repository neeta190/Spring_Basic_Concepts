package com.ioc.loose.coupling;

public class WebServiceUserDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        return "WebServiceUserDataProvider User Details";
    }
}
