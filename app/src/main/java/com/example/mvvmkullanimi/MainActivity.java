package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main);

        tasarim.textViewSonuc.setText("0");

        tasarim.buttonTopla.setOnClickListener(v -> {
            int sayi1 = Integer.parseInt(tasarim.editTextSayi1.getText().toString());
            int sayi2 = Integer.parseInt(tasarim.editTextSayi2.getText().toString());

            int toplam = sayi1 + sayi2;

            tasarim.textViewSonuc.setText(String.valueOf(toplam));

        });
        tasarim.buttonCarp.setOnClickListener(v -> {
            int sayi1 = Integer.parseInt(tasarim.editTextSayi1.getText().toString());
            int sayi2 = Integer.parseInt(tasarim.editTextSayi2.getText().toString());

            int carpim = sayi1 * sayi2;

            tasarim.textViewSonuc.setText(String.valueOf(carpim));

        });

    }
}