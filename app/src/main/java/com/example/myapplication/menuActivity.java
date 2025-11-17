package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LinearLayout btn1 = findViewById(R.id.btnSobreMi);
        LinearLayout btn2 = findViewById(R.id.btnHistoria);
        LinearLayout btn3 = findViewById(R.id.btnHobbies);
        LinearLayout btn4 = findViewById(R.id.btnOpiniones);

        btn1.setOnClickListener(v ->
                startActivity(new Intent(this, SobreMiActivity.class)));

        btn2.setOnClickListener(v ->
                startActivity(new Intent(this, HistoriaActivity.class)));

        btn3.setOnClickListener(v ->
                startActivity(new Intent(this, HobbiesActivity.class)));

        btn4.setOnClickListener(v ->
                startActivity(new Intent(this, OpinionesActivity.class)));
    }
}
