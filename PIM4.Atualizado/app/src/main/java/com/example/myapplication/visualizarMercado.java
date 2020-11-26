package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import DataBase.DadosOpenHelper;

public class visualizarMercado extends AppCompatActivity {
  ListView listView;
    private Object ListView;
    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;
    private Object LoginActivity;
    private Object activity_carteira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_mercado);
    }
    private  void criarconexao(){
        try {

            DadosOpenHelper = new DadosOpenHelper(this);

            conexao = DadosOpenHelper.getWritableDatabase();
            System.err.println(Snackbar.make((View) LoginActivity, R.string.message_conexao_criada_com_sucesso, Snackbar.LENGTH_LONG))
                    .SetAction("OK", null).show[];


        }catch (SQLException ex){

            AlertDialog.Biulder dlg = new AlertDialog.Builder(this);
            dlg.SetTitle("Erro");
            dlg.SetMessage(ex.getMessage());
            dlg.SetNeutralButton("OK", null);
            ((AlertDialog.Builder) dlg).show();
        }

    }

    public void proximatela(View view) {
        Class<?> activity_menu = null;
        startActivityForResult(new Intent(this, activity_men.class)1);
    }

    public void pressionaBotao(View view) {
        startActivityForResult(new Intent(this, activity_carteira.class)1);
    }

    public void Botao(View view) {
        startActivityForResult(new Intent(this, activity_perfil.class)1);
    }

    public void pressBotao(View view) {
        startActivityForResult(new Intent(this, activity_historico.class)1);
    }
}