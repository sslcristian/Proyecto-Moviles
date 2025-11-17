package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText txtUsuario = findViewById(R.id.txtUsuario);
        EditText txtContrasena = findViewById(R.id.txtContrasena);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String user = txtUsuario.getText().toString();
            String pass = txtContrasena.getText().toString();


            if (user.equals("cristian") && pass.equals("1234")) {
                Intent i = new Intent(loginActivity.this, menuActivity.class);
                startActivity(i);
                finish();
            } else {
                Toast.makeText(loginActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
