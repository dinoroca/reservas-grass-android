package com.reciclyng;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.reciclyng.databinding.ActivityVerificationBinding;

public class VerifyCuentaActivity extends AppCompatActivity {
    ActivityVerificationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnConfirmRegistration.setOnClickListener(v -> {
            startActivity(new Intent(VerifyCuentaActivity.this, MainClientActivity.class));
            finish();
        });
    }

}
