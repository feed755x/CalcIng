package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class notacion extends AppCompatActivity {
    TextView tvResultado;
    EditText valor1, valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notacion);

        valor1 = findViewById(R.id.text1);
        valor2 = findViewById(R.id.text2);
        tvResultado = findViewById(R.id.tvResM);
    }

    public void operacion(View view){
        String v1 = valor1.getText().toString();
        int aux = Integer.parseInt(v1);

        String v2 = valor2.getText().toString();
        int aux2 = Integer.parseInt(v2);
        int resultado = 1;

        for (int i=1; i<=aux2; i++){
            resultado = resultado * aux;
        }

        tvResultado.setText("Resultado "+(resultado));
    }
}
