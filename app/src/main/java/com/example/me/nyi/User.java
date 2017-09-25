package com.example.me.nyi;

import android.util.Log;

/**
 * Created by ME on 08-Sep-17.
 */

public class User {
    private final String Tag ="User Class";
    String name, userid, password, companyName, contactInfo;

    public User(String userid, String password){
        this.userid = userid;
        this.password = password;
    }
    public User(String name, String userid, String password, String companyName, String contactInfo){
         this.name = name;
        this.userid = userid;
        this.password = password;
        this.companyName = companyName;
        this.contactInfo = contactInfo;
        Log.d(Tag, "User created");
    }
}
