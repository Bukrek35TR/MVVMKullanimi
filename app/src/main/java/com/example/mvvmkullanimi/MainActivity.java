package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSonuc;
    private EditText editTextSayi1, editTextSayi2;
    private Button buttonTopla, buttonCarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSonuc = findViewById(R.id.textViewSonuc);
        editTextSayi1 = findViewById(R.id.editTextSayi1);
        editTextSayi2 = findViewById(R.id.editTextSayi2);
        buttonTopla = findViewById(R.id.buttonTopla);
        buttonCarp = findViewById(R.id.buttonCarp);

        textViewSonuc.setText("0");

        buttonTopla.setOnClickListener(v -> {
            int sayi1 = Integer.parseInt(editTextSayi1.getText().toString());
            int sayi2 = Integer.parseInt(editTextSayi2.getText().toString());

            int toplam = sayi1 + sayi2;

            textViewSonuc.setText(String.valueOf(toplam));

        });
        buttonCarp.setOnClickListener(v -> {
            int sayi1 = Integer.parseInt(editTextSayi1.getText().toString());
            int sayi2 = Integer.parseInt(editTextSayi2.getText().toString());

            int carpim = sayi1 * sayi2;

            textViewSonuc.setText(String.valueOf(carpim));

        });

    }
}