package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class interfaz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz1);

        EditText num1 = findViewById(R.id.numero1);
        EditText num2 = findViewById(R.id.numero2);
        TextView resultado = findViewById(R.id.txtResultado);

        Button suma = findViewById(R.id.btnSuma);
        Button resta = findViewById(R.id.btnResta);
        Button multi = findViewById(R.id.btnMulti);
        Button div = findViewById(R.id.btnDiv);

        suma.setOnClickListener(v -> {
            double r = Double.parseDouble(num1.getText().toString()) +
                    Double.parseDouble(num2.getText().toString());
            resultado.setText("Resultado: " + r);
        });

        resta.setOnClickListener(v -> {
            double r = Double.parseDouble(num1.getText().toString()) -
                    Double.parseDouble(num2.getText().toString());
            resultado.setText("Resultado: " + r);
        });

        multi.setOnClickListener(v -> {
            double r = Double.parseDouble(num1.getText().toString()) *
                    Double.parseDouble(num2.getText().toString());
            resultado.setText("Resultado: " + r);
        });

        div.setOnClickListener(v -> {
            double r = Double.parseDouble(num1.getText().toString()) /
                    Double.parseDouble(num2.getText().toString());
            resultado.setText("Resultado: " + r);
        });
        Button volver = findViewById(R.id.btnVolver);
        volver.setOnClickListener(v -> finish());

    }
}
