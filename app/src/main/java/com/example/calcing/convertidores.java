package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class convertidores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidores);
    }

    public void num (View view)
    {
        Intent num = new Intent(this,numero.class);
        startActivity(num);
    }

    public void temp (View view)
    {
        Intent temp = new Intent(this,temperatura.class);
        startActivity(temp);
    }

    public void nota (View view)
    {
        Intent nota = new Intent(this,notacion.class);
        startActivity(nota);
    }

    public void grr (View view)
    {
        Intent grr = new Intent(this, gr.class);
        startActivity(grr);
    }
    public void bit (View view)
    {
        Intent bit = new Intent(this, bite.class);
        startActivity(bit);
    }
}
