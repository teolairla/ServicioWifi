package com.example.teo.serviciowifi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LanzarServicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzar_servicio);
    }

    public void arrancarServicio(View view) {

    startService(new Intent(getApplicationContext(),TestWifiConnection.class));

    }

    public void pararServicio(View view) {

    stopService(new Intent(getApplicationContext(),TestWifiConnection.class));

    }
}
