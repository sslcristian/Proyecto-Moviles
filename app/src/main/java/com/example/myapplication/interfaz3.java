package com.example.myapplication;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class interfaz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz3);

        EditText nombre = findViewById(R.id.txtNombre);
        EditText edad = findViewById(R.id.txtEdad);
        EditText correo = findViewById(R.id.txtCorreo);
        Button guardar = findViewById(R.id.btnGuardar);

        guardar.setOnClickListener(v -> {
            String msg = "Guardado:\n" +
                    "Nombre: " + nombre.getText() + "\n" +
                    "Edad: " + edad.getText() + "\n" +
                    "Correo: " + correo.getText();

            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        });
        Button volver = findViewById(R.id.btnVolver);
        volver.setOnClickListener(v -> finish());

    }
}
