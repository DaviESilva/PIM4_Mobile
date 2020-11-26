package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication.ui.login.LoginViewModel;
import com.example.myapplication.ui.login.LoginViewModelFactory;
import com.example.myapplication.ui.login.activity_login1;

public class TelaPrincipal extends AppCompatActivity {

    private Object activity_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        LoginViewModel loginViewMode = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

    public void proximatela(View Object view) {
        startActivityForResult(new Intent(this,  activity_login.class)1);

    }


    public void pressionaBotao(View view) {
        startActivityForResult(new Intent(this, activity_login1.class)1);
    }
  }

    public void pressionaBotao(View view) {
        startActivityForResult(new Intent(this, activity_login1.class)1);
    }

    public void proximatela(View view) {
        startActivityForResult(new Intent(this, activity_login.class)1);
    }
}