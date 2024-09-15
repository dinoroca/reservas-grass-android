package com.reciclyng;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.reciclyng.databinding.ActivityRegistroBinding;

public class RegistroActivity extends AppCompatActivity {
    ActivityRegistroBinding binding;
    public static String correo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        if (getIntent().getExtras() != null) {
//            correo = getIntent().getStringExtra("correo");
//            binding.tvCorreo.setText(correo);
//        }

        binding.btnRegister.setOnClickListener(v -> {
            startActivity(new Intent(RegistroActivity.this, VerifyCuentaActivity.class));
            finish();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.etEmail.setText(correo);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(RegistroActivity.this, MainActivity.class));
        finish();
    }
}