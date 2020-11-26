package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import DataBase.DadosOpenHelper;

public class Carteira extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;
    private Object LoginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carteira);
    }

    public void PressionaBotao(View view) {

        public  void proximatela(){
            Object imageButton12 = null;
            Object proximatela = null;
            if (imageButton12 == proximatela){
                startActivityForResult( new Intent(this, activity_tela_principal.class),1);
            }

        }
        public  void proximatela(View view){
            boolean imageButton13 = false;
            boolean proximatela = false;
            if (imageButton13 == proximatela){
                startActivityForResult( new Intent(this, activity_carteira.class),1);
            }

        }
        public void proximatela(View view){
            Object imageButton14 = null;
            Object proximatela = null;
            if (imageButton14 == proximatela){
                startActivityForResult( new Intent(this, activity_perfil.class),1);
            }

        }
        public  void proximatela(View view){
            Object imageButton15 = null;
            Object proximatela = null;
            if (imageButton15 == proximatela){
                startActivityForResult( new Intent(this, activity_historico.class),1);
            }
    }
}