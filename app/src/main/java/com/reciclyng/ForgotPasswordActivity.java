package com.reciclyng;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.reciclyng.databinding.ActivityForgotPasswordBinding;
import com.reciclyng.databinding.ActivityVerificationBinding;

public class ForgotPasswordActivity extends AppCompatActivity {
    ActivityForgotPasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSendCode.setOnClickListener(v -> {
            startActivity(new Intent(ForgotPasswordActivity.this, VerificationMailActivity.class));
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ForgotPasswordActivity.this, MainActivity.class));
        finish();
    }
}
