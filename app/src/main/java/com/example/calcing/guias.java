package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class guias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guias);
    }

    public  void seg (View view)
    {
        Intent seg = new Intent(this, segmentacion.class);
        startActivity(seg);
    }

    public  void com (View view)
    {
        Intent com = new Intent(this, comandos.class);
        startActivity(com);
    }

    public void sis (View view)
    {
        Intent sis = new Intent(this,sistemas.class);
        startActivity(sis);
    }

    public void norm (View view)
    {
        Intent norm = new Intent(this, normas.class);
        startActivity(norm);
    }

    public void elect (View view)
    {
        Intent elect = new Intent(this, electricidad.class);
        startActivity(elect);
    }

}
