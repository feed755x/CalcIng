package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class condensadores extends AppCompatActivity {
    EditText num1, num2, letra;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condensadores);
    num1 = findViewById(R.id.text1);
    num2 = findViewById(R.id.text2);
    letra = findViewById(R.id.text3);
    tvResultado = findViewById(R.id.tvResM);

    }

    public void decifrar (View view){
        String cero = "";

        String v1 = num1.getText().toString();
        int aux = Integer.parseInt(v1);

        String v2 = num2.getText().toString();
        int aux2 = Integer.parseInt(v2);

        String valor = letra.getText().toString();

        for(int i=0; i<aux2;i++){
        cero = "0"+cero;
        }

        tvResultado.setText(aux+cero+" pF -> "+valor+"%");



    }
}
