package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.login.activity_menu;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
   public void PressionaBotao(View view){
        Class<?> activity_carteira;
        startActivityForResult(new Intent(this, activity_carteira.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_bitcoin.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_historico.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_perfil.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_visualiza_mercado.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_tela_principal.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_carteira.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_perfil.class),1);
    }
    public void PressionaBotao(View view){
        startActivityForResult(new Intent(this, activity_menu.class),1);
    }
}
