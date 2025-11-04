package com.example.myapplication;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class interfaz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz2);

        EditText input = findViewById(R.id.txtNum);
        Spinner spinner = findViewById(R.id.spinner);
        TextView result = findViewById(R.id.txtResultadoConv);
        Button btn = findViewById(R.id.btnConvertir);

        String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spinner.setAdapter(adapter);

        btn.setOnClickListener(v -> {
            double val = Double.parseDouble(input.getText().toString());
            String op = spinner.getSelectedItem().toString();

            if (op.equals("Celsius a Fahrenheit")) {
                result.setText("Resultado: " + (val * 1.8 + 32));
            } else {
                result.setText("Resultado: " + ((val - 32) / 1.8));
            }
        });
        Button volver = findViewById(R.id.btnVolver);
        volver.setOnClickListener(v -> finish());

    }
}
