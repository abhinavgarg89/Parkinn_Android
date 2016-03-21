package com.example.coingeittechnology.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.Menu;


public class Welcome extends AppCompatActivity implements View.OnClickListener {

    Button bLakshminagar;
    Button bYamunabank;
    Button bAshoknagar;
    Button bDelhi;
    Button bNoida;
    Button bNirmanvihar;
    Button bRajivchowk;
    Button bIndiagate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        bLakshminagar = (Button) findViewById(R.id.bLakshminagar);
        bYamunabank = (Button) findViewById(R.id.bYamunabank);
        bAshoknagar = (Button) findViewById(R.id.bAshoknagar);
        bDelhi = (Button) findViewById(R.id.bDelhi);
        bNoida = (Button) findViewById(R.id.bNoida);
        bNirmanvihar = (Button) findViewById(R.id.bNirmanvihar);
        bRajivchowk = (Button) findViewById(R.id.bRajivchowk);
        bIndiagate = (Button) findViewById(R.id.bIndiagate);



        bLakshminagar.setOnClickListener(this);
        bYamunabank.setOnClickListener(this);
        bAshoknagar.setOnClickListener(this);
        bDelhi.setOnClickListener(this);
        bNoida.setOnClickListener(this);
        bNirmanvihar.setOnClickListener(this);
        bRajivchowk.setOnClickListener(this);
        bIndiagate.setOnClickListener(this);



    }


    @Override
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);
            return true;
    }



    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLakshminagar:
            case R.id.bYamunabank:
            case R.id.bAshoknagar:
            case R.id.bDelhi:
            case R.id.bNoida:
            case R.id.bNirmanvihar:
            case R.id.bRajivchowk:
            case R.id.bIndiagate:



                startActivity(new Intent(this, Parkinglot.class));

                break;
        }
    }
}


