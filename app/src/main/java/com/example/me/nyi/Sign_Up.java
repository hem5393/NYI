package com.example.me.nyi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ME on 07-Sep-17.
 */

public class Sign_Up extends AppCompatActivity {

    String name, userid, password, companyName, contactInfo;
    EditText editText_userId, editText_password, editText_name, editText_companyname, editText_contact;
    Button button_signup;
    private static final String TAG = "Signup";
    LocalStorage localStorage;
    SharedPreferences sharedPreferences;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        Intent intent = getIntent();

        editText_name = (EditText) findViewById(R.id.editText_username);
        editText_userId = (EditText) findViewById(R.id.editText_userid);
        editText_password = (EditText) findViewById(R.id.editText_password);
        editText_companyname = (EditText) findViewById(R.id.editText_companyname);
        editText_contact = (EditText) findViewById(R.id.editText_contact);

        button_signup = (Button) findViewById(R.id.button_signup);

        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref",MODE_PRIVATE);

        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = editText_name.getText().toString();
                userid = editText_userId.getText().toString();
                password = editText_password.getText().toString();
                companyName = editText_companyname.getText().toString();
                contactInfo = editText_contact.getText().toString();
                Log.d(TAG,"Sign Up happened");

                User newuser = new User(name, userid, password, companyName, contactInfo);
                localStorage = new LocalStorage(getApplicationContext());
                localStorage.storeUser(newuser);
                String size = sharedPreferences.getString("name",null);
                Log.d(TAG,size);
                Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
