package com.example.me.nyi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ME on 07-Sep-17.
 */

public class Sign_In extends AppCompatActivity {

    Button button_login;
    EditText editText_userId, editText_password;
    LocalStorage localStorage;
    SharedPreferences sharedPreferences;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        button_login = (Button) findViewById(R.id.button_login);
        editText_userId = (EditText) findViewById(R.id.editText_userid);
        editText_password = (EditText)findViewById(R.id.editText_password);

        localStorage = new LocalStorage(this);
        sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String userId = editText_userId.getText().toString();
                final String password = editText_password.getText().toString();

                if (localStorage.getUser().name.equals(userId)){
                    Toast.makeText(getApplicationContext(),"Got it",Toast.LENGTH_SHORT).show();
                }

                if (sharedPreferences.getString("name",null).equals("hem")){

                    //Toast.makeText(getApplicationContext(),"Got it",Toast.LENGTH_SHORT).show();
                }

                if (userId.endsWith("hem") && password.equals("hem")){
                    Intent i = new Intent(getApplicationContext(),Demo.class);
                    startActivity(i);

                }
                else{
                    editText_password.setError("Wrong password");
                }

            }
        });


    }
}
