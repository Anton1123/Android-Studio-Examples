package com.example.anton.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity implements View.OnClickListener {

    Button refresh1, details1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Home");

        refresh1 = (Button) findViewById(R.id.refresh1);
        details1 = (Button) findViewById(R.id.details1);
        refresh1.setOnClickListener(this);
        details1.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.refresh1:

                Intent startHome2 = new Intent(getApplicationContext(), Home2.class);
                startActivity(startHome2);
                break;

            case R.id.details1:

                Intent startDetails = new Intent(getApplicationContext(), Details.class);
                startActivity(startDetails);
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
