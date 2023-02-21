package com.example.mvvmkullanimi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class); //ViewModel sınıfını ana sınıfa bağlama

        tasarim.setMainActivityNesnesi(this); //xml içerisindeki nesneye bu sınıf üzerinde erişim yetkisi

        tasarim.setHesaplamaSonucu(viewModel.getSonuc());
    }

    public void buttonToplama(String sayi1, String sayi2) {
        viewModel.toplamaYap(sayi1, sayi2);
        tasarim.setHesaplamaSonucu(viewModel.getSonuc());
    }

    public void buttonCarpma(String sayi1, String sayi2) {
        viewModel.carpmaYap(sayi1, sayi2);
        tasarim.setHesaplamaSonucu(viewModel.getSonuc());
    }

}