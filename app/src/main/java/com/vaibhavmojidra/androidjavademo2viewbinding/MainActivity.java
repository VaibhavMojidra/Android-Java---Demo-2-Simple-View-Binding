package com.vaibhavmojidra.androidjavademo2viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.vaibhavmojidra.androidjavademo2viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addButton.setOnClickListener(view -> {
            int num1=Integer.parseInt(binding.num1EditTextNumber.getText().toString());
            int num2=Integer.parseInt(binding.num2EditTextNumber.getText().toString());
            binding.resultTextView.setText("Result: "+(num1+num2));
        });
    }
}