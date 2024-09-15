package com.reciclyng;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.reciclyng.databinding.ActivityVerificationMailBinding;

public class VerificationMailActivity extends AppCompatActivity {
    ActivityVerificationMailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerificationMailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(VerificationMailActivity.this, ForgotPasswordActivity.class));
        finish();
    }
}
