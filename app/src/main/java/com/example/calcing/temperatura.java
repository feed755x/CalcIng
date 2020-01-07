package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class temperatura extends AppCompatActivity {

    RadioButton r1,r2;
    TextView tvResultado;
    EditText valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        valor = findViewById(R.id.text1);
        tvResultado = findViewById(R.id.tvResM);
        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);

    }

    public void convertir (View view){
        if (r1.isChecked() == true){
            String v1 = valor.getText().toString();
            int aux = Integer.parseInt(v1);
            int resultado = (aux-32)*5/9;
            tvResultado.setText(resultado+"°C");
        }else
            if (r2.isChecked() == true){
                String v1 = valor.getText().toString();
                int aux = Integer.parseInt(v1);
                int resultado = (aux*9/5)+32;
                tvResultado.setText(resultado + "°F");
        }
    }

}
