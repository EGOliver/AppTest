package com.example.apptest.ui.fina;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

import android.net.Uri;

import androidx.annotation.ContentView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URLConnection;

public class FinalViewModel extends ViewModel {

    Uri deepLink;
    private final MutableLiveData<String> mText;

    public FinalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aqui é para teste.\n Pega o jogo: https://store.steampowered.com/app/269210/Hero_Siege/");
    }

    public LiveData<String> getText() {
        return mText;
    }
}