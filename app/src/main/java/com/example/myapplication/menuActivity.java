package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button btn1 = findViewById(R.id.btnInterfaz1);
        Button btn2 = findViewById(R.id.btnInterfaz2);
        Button btn3 = findViewById(R.id.btnInterfaz3);
        Button btn4 = findViewById(R.id.btnInterfaz4);

        btn1.setOnClickListener(v -> startActivity(new Intent(this, interfaz1.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(this, interfaz2.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(this, interfaz3.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(this, interfaz4.class)));
    }
}
