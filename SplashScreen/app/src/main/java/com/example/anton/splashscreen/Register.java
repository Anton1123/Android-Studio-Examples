package com.example.anton.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity /*implements View.OnClickListener*/ {

    Button newRegister;
    EditText newFirstname, newLastname, newAge, newZIP, newUsername, newPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        newFirstname = (EditText) findViewById(R.id.newFirstname);
        newLastname = (EditText) findViewById(R.id.newLastname);
        newAge = (EditText) findViewById(R.id.newAge);
        newZIP = (EditText) findViewById(R.id.newZIP);
        newUsername = (EditText) findViewById(R.id.newUsername);
        newPassword = (EditText) findViewById(R.id.newPassword);

//        newRegister.setOnClickListener(this);
    }

   /* @Override
    public void onClick(View v) {
        switch ((v.getId())){
            case R.id.newRegister:


                break;
        }
    }*/
}
