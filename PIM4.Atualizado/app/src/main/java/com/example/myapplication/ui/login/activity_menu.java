package com.example.myapplication.ui.login;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

import DataBase.DadosOpenHelper;

public class activity_menu extends Activity {
    private LoginViewModel loginViewModel;
    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginViewModel = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);
    }

}
