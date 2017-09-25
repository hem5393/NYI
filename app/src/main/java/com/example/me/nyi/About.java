package com.example.me.nyi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ME on 07-Sep-17.
 */

public class About extends AppCompatActivity{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        Intent intent = getIntent();
    }

}
