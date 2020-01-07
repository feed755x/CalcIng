package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class numero extends AppCompatActivity {
    TextView tvResultado;
    EditText valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);
        valor = findViewById(R.id.text1);
        tvResultado = findViewById(R.id.tvResM);
    }

    public void deciabina(View view){
        String binario = "";
        String v1 = valor.getText().toString();
        int aux = Integer.parseInt(v1);

        if (aux> 0) {

            while (aux > 0) {

                if (aux % 2 == 0) {

                    binario = "0" + binario;

                } else {

                    binario = "1" + binario;

                }

                aux = (int) aux / 2;

            }

        } else if (aux == 0) {

            binario = "0";

        }

        tvResultado.setText("B:"+binario);
    }
}
