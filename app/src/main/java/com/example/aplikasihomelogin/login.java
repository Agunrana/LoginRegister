package com.example.aplikasihomelogin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import com.example.aplikasihomelogin.R;
import com.example.aplikasihomelogin.tampilanhome;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    private EditText username, password;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnlogin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void login (View view){
        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();

        if (usernameText.equals("Agun") && passwordText.equals("123")){
            Intent intent = new Intent(login.this, tampilanhome.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}