package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bite extends AppCompatActivity {
    EditText valor;
    RadioButton r1,r2,r3,r4,r5;
    TextView bt,kb,mb,gb,tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bite);

        valor = findViewById(R.id.text1);

        bt = findViewById(R.id.tvRes1);
        kb = findViewById(R.id.tvRes2);
        mb = findViewById(R.id.tvRes3);
        gb = findViewById(R.id.tvRes4);
        tb = findViewById(R.id.tvRes5);

        r1 = findViewById(R.id.rb0);
        r2 = findViewById(R.id.rb1);
        r3 = findViewById(R.id.rb2);
        r4 = findViewById(R.id.rb3);
        r5 = findViewById(R.id.rb4);

    }

    public void seleccion (View view){




        if(r1.isChecked() == true){
            String v1 = valor.getText().toString();
            Double aux = Double.parseDouble(v1);
            bt.setText(aux + " Bytes");
            kb.setText((aux/1024) +" Kbytes");
            mb.setText((aux/1024)/1024 + " Mbytes");
            gb.setText(((aux/1024)/1024)/1024 + "Gbytes");
            tb.setText((((aux/1024)/1024)/1024)/1024 + "Tbytes");
        }else
            if (r2.isChecked() == true){
                String v1 = valor.getText().toString();
                Double aux = Double.parseDouble(v1);
                bt.setText((aux*8)+" Bytes");
                kb.setText(aux + " Kbytes");
                mb.setText((aux/1024) + " Mbytes");
                gb.setText((aux/1024)/1024 + "Gbytes");
                tb.setText((((aux/1024)/1024)/1024) + "Tbytes");

        }else
            if (r3.isChecked() == true){
                String v1 = valor.getText().toString();
                Double aux = Double.parseDouble(v1);
                bt.setText(((aux*1024)*8)+" Bytes");
                kb.setText((aux*1024) + "Kbytes");
                mb.setText(aux + "Mbytes");
                gb.setText((aux/1024) + "Gbytes");
                tb.setText(((aux/1024)/1024) + "Tbytes");

        }else
            if (r4.isChecked() == true){
                String v1 = valor.getText().toString();
                Double aux = Double.parseDouble(v1);
                bt.setText((((aux*1024)*1024)*8)+" Bytes");
                kb.setText(((aux*1024)*1024) + "Kbytes");
                mb.setText((aux*1024) + "Mbytes");
                gb.setText(aux + " Gbytes");
                tb.setText((aux/1024) + "Tbytes");

        }else
            if (r5.isChecked() == true){
                String v1 = valor.getText().toString();
                Double aux = Double.parseDouble(v1);
                bt.setText((((aux*1024)*1024)*1024)*8+" Bytes");
                kb.setText(((aux*1024)*1024)*1024 + "Kbytes");
                mb.setText((aux*1024)*1024 + "Mbytes");
                gb.setText((aux*1024)+" Gbytes");
                tb.setText(aux + " Tbytes");
        }
    }
}
