package com.example.mvvmkullanimi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<String> sonuc;
    private MatematikRepository mRepository = new MatematikRepository();

    public MainActivityViewModel() {
        sonuc = mRepository.getMatematikselSonuc();
    }

    public MutableLiveData<String> getSonuc() {
        return sonuc;
    }

    public void toplamaYap(String sayi1, String sayi2) {
        mRepository.topla(sayi1, sayi2);
    }

    public void carpmaYap(String sayi1, String sayi2) {
        mRepository.carp(sayi1, sayi2);
    }
}
