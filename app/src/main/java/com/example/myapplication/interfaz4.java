package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class interfaz4 extends AppCompatActivity {

    String[] frases = {
            "La vida es 10% lo que te ocurre y 90% cómo reaccionas.",
            "El éxito es la suma de pequeños esfuerzos repetidos cada día.",
            "Nunca es tarde para ser la mejor versión de ti.",
            "La disciplina tarde o temprano vence al talento.",
            "Si puedes soñarlo, puedes lograrlo."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz4);

        TextView txt = findViewById(R.id.txtFrase);
        Button btn = findViewById(R.id.btnFrase);

        btn.setOnClickListener(v -> {
            int index = new Random().nextInt(frases.length);
            txt.setText(frases[index]);
        });
        Button volver = findViewById(R.id.btnVolver);
        volver.setOnClickListener(v -> finish());

    }
}
