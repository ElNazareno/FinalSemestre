package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_2 extends AppCompatActivity {
    TextView nombre,bienvenida;
    ImageView logo;
    Animation ww,ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        variables_animaciones();
        splashh();
    }
    private void variables_animaciones(){
        ww = AnimationUtils.loadAnimation(this,R.anim.animation);
        ss = AnimationUtils.loadAnimation(this,R.anim.animacion2);

        logo=findViewById(R.id.imvIcon);
        nombre=findViewById(R.id.lblNombre);
        bienvenida=findViewById(R.id.lblBienvenido);

        logo.setAnimation(ss);
        nombre.setAnimation(ss);
        bienvenida.setAnimation(ss);
    }

    private void splashh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(splash_2.this,loginSelecciona.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}