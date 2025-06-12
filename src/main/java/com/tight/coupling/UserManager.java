package com.tight.coupling;

public class UserManager {

    private UserDBProvider userDBProvider = new UserDBProvider();

    public String getUserInfo(){
        return userDBProvider.getUserDetails();
    }
}
