package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.login.activity_erro;

public class Erro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro);
    }
    public void Erro (View view){
        System.out.println(("por favor verifica o seu cadastro"));
    }
   public void PressionaBotao (View view){
       startActivityForResult( new Intent(this, activity_login3.class),1);
   }
}