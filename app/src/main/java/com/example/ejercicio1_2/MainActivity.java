package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.ejercicio1_2.Datos.Persona;
public class MainActivity extends AppCompatActivity {
    EditText editTNombre,editTApellido,editTEdad,editTCorreo;
    Button btnEnviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTNombre = (EditText) findViewById(R.id.txtnombre);
        editTApellido = (EditText) findViewById(R.id.txtapellido);
        editTEdad = (EditText) findViewById(R.id.txtedad);
        editTCorreo = (EditText) findViewById(R.id.txtCorreo);

        btnEnviar = (Button) findViewById(R.id.buttonEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDato();
            }
        });
    }

    public void enviarDato()
    {
        Persona datos = new Persona();
        datos.setNombre(editTNombre.getText().toString());
        datos.setApellido(editTApellido.getText().toString());
        datos.setEdad(editTEdad.getText().toString());
        datos.setCorreo(editTCorreo.getText().toString());

        Intent intent = new Intent(getApplicationContext(), MainActivityResultado.class);
        intent.putExtra("Putnombre", datos.getNombre());
        intent.putExtra("Putapellido", datos.getApellido());
        intent.putExtra("Putedad", datos.getEdad());
        intent.putExtra("Putcorreo", datos.getCorreo());
        startActivity(intent);
    }

}