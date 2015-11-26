package com.example.anton.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin, bRegister, bZip;
    EditText etUsername, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bRegister = (Button) findViewById(R.id.bRegister);
        bZip = (Button) findViewById(R.id.bZip);

        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);
        bZip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogin:

                Intent startHomeScreen = new Intent(getApplicationContext(), Home.class);
                startActivity(startHomeScreen);

                break;

            case R.id.bRegister:

                Intent startRegisterScreen = new Intent(getApplicationContext(), Register.class);
                startActivity(startRegisterScreen);

                break;

            case R.id.bZip:

                Intent startHome2Screen = new Intent(getApplicationContext(), Home2.class);
                startActivity(startHome2Screen);

                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent startSettings = new Intent(getApplicationContext(), Settings.class);
            startActivity(startSettings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
