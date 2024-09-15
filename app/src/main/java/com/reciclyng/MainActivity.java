package com.reciclyng;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.reciclyng.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvCrearCuenta.setOnClickListener(v -> {
            String correo = "";
            if (binding.etEmail.getText() != null) {
                correo = binding.etEmail.getText().toString();
            }
            startActivity(new Intent(MainActivity.this, RegistroActivity.class));
            RegistroActivity.correo = correo;
            finish();
        });

        binding.tvRecuperar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ForgotPasswordActivity.class));
            finish();
        });
    }
}