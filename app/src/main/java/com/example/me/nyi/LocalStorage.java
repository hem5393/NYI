package com.example.me.nyi;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ME on 08-Sep-17.
 */

public class LocalStorage {

    public static final String SP_Name = "MyPref";
    SharedPreferences sharedPreferences;

    public LocalStorage(Context context){
        sharedPreferences = context.getSharedPreferences(SP_Name,Context.MODE_PRIVATE);
    }

    public void storeUser (User user){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", user.name);
        editor.putString("userid", user.userid);
        editor.putString("password", user.password);
        editor.putString("companyname", user.companyName);
        editor.putString("contact", user.contactInfo);
        editor.commit();

    }

    public User getUser (){
        String name = sharedPreferences.getString("name","");
        String userid = sharedPreferences.getString("userid","");
        String password = sharedPreferences.getString("password","");
        String companyname = sharedPreferences.getString("companyname","");
        String contact = sharedPreferences.getString("contact","");

        User user = new User(name, userid, password, companyname, contact);

        return user;
    }




}
