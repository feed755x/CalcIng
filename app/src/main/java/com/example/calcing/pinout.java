package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pinout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinout);
    }

    public void rj4 (View view)
    {
        Intent rj4 = new Intent(this, rj45.class);
        startActivity(rj4);
    }

    public void  rj1 (View view)
    {
        Intent rj1 = new Intent(this, rj11.class);
        startActivity(rj1);
    }

    public void ardu (View view)
    {
        Intent ardu = new Intent(this, arduino.class);
        startActivity(ardu);
    }

    public  void raspb (View view)
    {
        Intent raspb = new Intent(this, raspberry.class);
        startActivity(raspb);
    }

    public void aud (View view)
    {
        Intent aud = new Intent(this, audio.class);
        startActivity(aud);

    }






}
