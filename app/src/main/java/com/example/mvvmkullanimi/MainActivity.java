package com.example.mvvmkullanimi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tasarim.setMainActivityNesnesi(this); //xml içerisindeki nesneye bu sınıf üzerinde erişim yetkisi

        tasarim.textViewSonuc.setText("0");
    }

    public void buttonToplama(String alinanSayi1, String alinanSayi2) {
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int toplam = sayi1 + sayi2;

        tasarim.textViewSonuc.setText(String.valueOf(toplam));
    }

    public void buttonCarpma(String alinanSayi1, String alinanSayi2) {
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);


        int carpim = sayi1 * sayi2;

        tasarim.textViewSonuc.setText(String.valueOf(carpim));
    }

}