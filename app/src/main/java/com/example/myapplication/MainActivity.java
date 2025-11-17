package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // directamente abrimos menuActivity (para mantener estructura parecida a la tuya)
        startActivity(new Intent(this, loginActivity.class));
        finish();
    }
}
