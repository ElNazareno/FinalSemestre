package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginSelecciona extends AppCompatActivity  {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_selecciona);


    }



    public void btnInicioSess(View view) {
        Intent intent =new Intent(loginSelecciona.this,InicioSesion.class);
        startActivity(intent);
    }

    public void btnNuevaCuenta(View view) {
        Intent intent =new Intent(loginSelecciona.this,NuevoRegistro.class);
        startActivity(intent);
    }
}