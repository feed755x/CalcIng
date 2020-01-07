package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class leyohm extends AppCompatActivity {

    TextView tvResultado;
    EditText et1,et2;
    RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leyohm);

        et1 = findViewById(R.id.ed1);
        et2 = findViewById(R.id.ed2);
        tvResultado = findViewById(R.id.tvResM);
        r1= findViewById(R.id.voltaje);
        r2=findViewById(R.id.corriente);
        r3 = findViewById(R.id.resistencia);
    }

    public void mostrar (View view){
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();
        int aux1 = Integer.parseInt(v1);
        int aux2 =  Integer.parseInt(v2);

        if (r1.isChecked() == true){
            int volt = aux1*aux2;
            tvResultado.setText("Voltaje = "+ volt +" Voltios");
        }else
            if (r2.isChecked() == true){
                int corr = aux1/aux2;
                tvResultado.setText("Corriente = "+corr+" Amperios");

            }else
                if (r3.isChecked() == true){
                    int calculoresis= aux1/aux2;
                    tvResultado.setText("Resistencia = "+ calculoresis+" Ohmios");

                }
    }




}
