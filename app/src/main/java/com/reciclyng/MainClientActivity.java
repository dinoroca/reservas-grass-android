package com.reciclyng;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.reciclyng.databinding.ActivityMainClientBinding;

public class MainClientActivity extends AppCompatActivity {
    ActivityMainClientBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainClientBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

}
