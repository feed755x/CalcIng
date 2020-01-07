package com.example.calcing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class direccionip extends AppCompatActivity {
    EditText a,b,c,d;
    TextView clase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccionip);

        a = findViewById(R.id.part1);
        b = findViewById(R.id.part2);
        c = findViewById(R.id.part3);
        d = findViewById(R.id.part4);

        clase = findViewById(R.id.clas);
    }

    public void buscar (View view){
        String v1 = a.getText().toString();
        int aux = Integer.parseInt(v1);

        if (aux >= 0 && aux<=127){
            clase.setText("Clase A");
        }else
            if (aux >= 128 && aux<=191){
                clase.setText("Clase B");
            }else
                if (aux >= 192 && aux<=223){
                    clase.setText("Clase C");
                }else
                    if (aux >=224 && aux<=239){
                        clase.setText("Clase D");
                    }else
                        if(aux >= 240 && aux<=247){
                            clase.setText("Clase E");
                        }else{
                            clase.setText("Error");
                        }
    }

}
