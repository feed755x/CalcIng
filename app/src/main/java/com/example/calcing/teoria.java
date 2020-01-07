package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class teoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teoria);
    }

    public void algebra (View view)
    {
        Intent algebra = new Intent(this,algebrab.class);
        startActivity(algebra);
    }

    public void unidad (View view)
    {
        Intent unidad = new Intent(this, unidades.class);
        startActivity(unidad);
    }

    public void calcul (View view)
    {
        Intent calcul = new Intent(this, calculo.class);
        startActivity(calcul);
    }

    public  void red (View view)
    {
        Intent red = new Intent(this,redes.class);
        startActivity(red);
    }
}
