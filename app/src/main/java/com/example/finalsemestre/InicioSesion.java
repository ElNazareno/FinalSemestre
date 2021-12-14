package com.example.finalsemestre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.example.finalsemestre.activitys.habitaciones;

public class InicioSesion extends AppCompatActivity  {
    Button nentrar,rregistro;
    TextView con,cor;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        firebaseAuth= FirebaseAuth.getInstance();
        nentrar=findViewById(R.id.btnEntrar);
        rregistro=findViewById(R.id.btnRegistrar);
        cor=findViewById(R.id.txtCorreoInicioSesion);
        con=findViewById(R.id.txtontrasenaInicioSesion);
    }

    public void login(){
        String corre=cor.getText().toString().trim();
        String contra=con.getText().toString().trim();
        if(TextUtils.isEmpty(corre)){
            Toast.makeText(this, "Ingrese su Correo", Toast.LENGTH_LONG).show();
            return;
        }else if(TextUtils.isEmpty(contra)){
            Toast.makeText(this, "Ingrese su Contraseña", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.signInWithEmailAndPassword(corre,contra).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(InicioSesion.this, "Bienvenido", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(InicioSesion.this,Main.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(InicioSesion.this, "Usuario u contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void registro(View view) {
        Intent intent=new Intent(InicioSesion.this,NuevoRegistro.class);
        startActivity(intent);
        finish();
    }

    public void Entrar(View view) {
        login();
    }
}