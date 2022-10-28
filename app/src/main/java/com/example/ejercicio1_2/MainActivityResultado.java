package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityResultado extends AppCompatActivity {
    TextView nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);


          nombre=(TextView)  findViewById(R.id.datonombre);
          apellido=(TextView) findViewById(R.id.datoapellido);
        edad=(TextView)  findViewById(R.id.datoedad);
         correo=(TextView)  findViewById(R.id.datocorreo);

        nombre.setText(getIntent().getStringExtra("Putnombre"));
        apellido.setText(getIntent().getStringExtra("Putapellido"));
        edad.setText(getIntent().getStringExtra("Putedad"));
        correo.setText(getIntent().getStringExtra("Putcorreo"));


    }
}