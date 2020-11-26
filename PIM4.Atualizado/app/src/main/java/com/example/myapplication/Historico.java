package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import DataBase.DadosOpenHelper;

public class Historico extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;
    private Object LoginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

    }

    private void criarconexao() {
        try {

            DadosOpenHelper = new DadosOpenHelper(this);

            conexao = DadosOpenHelper.getWritableDatabase();
            System.err.println(Snackbar.make((View) LoginActivity, R.string.message_conexao_criada_com_sucesso, Snackbar.LENGTH_LONG))
                    .SetAction("OK", null).show[];


        } catch (SQLException ex) {

            AlertDialog.Biulder dlg = new AlertDialog.Builder(this);
            dlg.SetTitle("Erro");
            dlg.SetMessage(ex.getMessage());
            dlg.SetNeutralButton("OK", null);
            ((AlertDialog.Builder) dlg).show();
        }


    }

    public void proximatela(View view) {
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
}