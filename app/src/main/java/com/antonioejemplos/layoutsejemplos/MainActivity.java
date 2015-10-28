package com.antonioejemplos.layoutsejemplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Poner  el layout a inflar
        setContentView(R.layout.activity_main);
    }
}
