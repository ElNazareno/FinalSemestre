package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.imageView);

        Bundle bundle=getIntent().getExtras();
        Integer info=bundle.getInt("iimg1");
        image.setImageResource(info);
    }
}