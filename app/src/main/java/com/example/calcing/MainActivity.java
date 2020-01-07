package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //INICIO DE METODOS DE SELECCION
    //Metodo para la ventana de calculadora
    public void seleccioncalc(View view)
        {
            Intent seleccioncalc = new Intent(this, calculadora.class);
            startActivity(seleccioncalc);
    }
    //Metodo para la ventana convertidores
    public void seleccionconv (View view){
        Intent seleccionconv = new Intent(this,convertidores.class);
        startActivity(seleccionconv);
    }

    //Metodo para la ventana teoria
    public void seleccionteoria (View view){
        Intent seleccionteoria = new Intent(this,teoria.class);
        startActivity(seleccionteoria);
    }

    //Meotodo para la ventana guia
    public void seleccionguia(View view){
        Intent seleccionguia = new Intent(this,guias.class);
        startActivity(seleccionguia);
    }

    //Metodo para la ventana pinout
    public void seleccionpinout(View view){
        Intent seleccionpinout = new Intent(this,pinout.class);
        startActivity(seleccionpinout);
    }

    //FIN DE LOS METODOS PARA SELECCION
}
