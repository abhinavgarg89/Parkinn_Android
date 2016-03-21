package com.example.coingeittechnology.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Parkinglot extends AppCompatActivity implements View.OnClickListener {
    Button bBookhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkinglot);
        bBookhere = (Button) findViewById(R.id.bBookhere);
        bBookhere.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.bBookhere:
                startActivity(new Intent(this, booked.class));

                break;
        }

    }}