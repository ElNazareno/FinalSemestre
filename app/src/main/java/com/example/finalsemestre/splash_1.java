package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_1 extends AppCompatActivity {
    TextView nombre,bienvenida;
    ImageView logo;
    Animation ww,ss;
    SoundPool sp;
    int son;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);
        song();
        variables_animaciones();
        splashh();
    }

    private void song(){
        sp=new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        son=sp.load(this, R.raw.sonido_inicio,1);
        sp.play(son, 1,1,1,0,0);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sonido_inicio);
        mp.start();
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
                Intent intent =new Intent(splash_1.this,splash_2.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}