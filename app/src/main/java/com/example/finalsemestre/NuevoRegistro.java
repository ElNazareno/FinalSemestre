package com.example.finalsemestre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalsemestre.activitys.habitaciones;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class NuevoRegistro extends AppCompatActivity implements View.OnClickListener {
    EditText Correo,Contrasena;
    Button registrar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_registro);
        firebaseAuth= FirebaseAuth.getInstance();

        Correo=findViewById(R.id.txtCorreo);
        Contrasena=findViewById(R.id.txtContrasena);

        registrar=findViewById(R.id.btnRegistrar);

        registrar.setOnClickListener(this);
    }
    private void registrarUsuario(){
        String corre=Correo.getText().toString().trim();
        String contra=Contrasena.getText().toString().trim();
        if(TextUtils.isEmpty(corre)){
            Toast.makeText(this, "Ingrese su Correo", Toast.LENGTH_LONG).show();
            return;
        }else if(TextUtils.isEmpty(contra)){
            Toast.makeText(this, "Ingrese su Contraseña", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.createUserWithEmailAndPassword(corre,contra).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(NuevoRegistro.this, "Registro Finalizado", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(NuevoRegistro.this, Main.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(NuevoRegistro.this, "Error Al Registrar", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

    @Override
    public void onClick(View view) {
        registrarUsuario();
    }

    public void Crear(View view) {
        registrarUsuario();
    }

    public void iniciarses(View view) {
        Intent intent = new Intent(NuevoRegistro.this, InicioSesion.class);
        startActivity(intent);
    }
}