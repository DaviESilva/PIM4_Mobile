package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Erro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro1);
    }
    public void Erro (View view){
        System.out.println(("por favor verifica os dados"));
    }
    public void PressionaBotao (View view){
        startActivityForResult( new Intent(this, activity_login3.class),1);
    }
}
}