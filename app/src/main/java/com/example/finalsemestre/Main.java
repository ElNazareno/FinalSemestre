package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.finalsemestre.activitys.habitaciones;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Habitaciones(View view) {
        Intent intent =new Intent(Main.this,habitaciones.class);
        startActivity(intent);
    }

    public void Ubicanos(View view) {
        Intent intent =new Intent(Main.this,MapsActivity.class);
        startActivity(intent);
    }

    public void Web(View view) {
        Intent intent =new Intent(Main.this,web.class);
        startActivity(intent);
    }

    public void CambioDeMoneda(View view) {
        Intent intent =new Intent(Main.this,cambio.class);
        startActivity(intent);
    }
}