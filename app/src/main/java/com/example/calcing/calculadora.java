package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void calcleyohm(View view)
    {
        Intent calcohm = new Intent(this, leyohm.class);
        startActivity(calcohm);
    }

    public void direcIP (View view){
        Intent direcIP = new Intent(this,direccionip.class);
        startActivity(direcIP);
    }

    public void conden (View view){
        Intent condensador = new Intent(this, condensadores.class);
        startActivity(condensador);
    }


}
