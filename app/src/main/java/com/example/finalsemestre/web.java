package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.google.com/travel/hotels/entity/CgsIw4n8mteVx87uARAB/overview?g2lb=2503781%2C2502548%2C4659203%2C4641139%2C4605861%2C4624411%2C2503771%2C4401769%2C4270442%2C4317915%2C2503935%2C4371335%2C4640247%2C4306835%2C4672717%2C4596364%2C4258168%2C4419364%2C4597339%2C4284970%2C4270859%2C4291517&hl=es-PE&gl=pe&cs=1&ssta=1&rp=EMOJ_JrXlcfO7gEQw4n8mteVx87uATgCQABIAcABAg&ictx=1&sa=X&utm_campaign=sharing&utm_medium=link&utm_source=htls&ts=CAESABpJCisSJzIlMHg5MTZkOWE4Mzk2YjM3MDk1OjB4ZWU5ZDFjYWQ3MzVmMDRjMxoAEhoSFAoHCOUPEAwYFhIHCOUPEAwYFxgBMgIQACoJCgU6A1BFThoA");
    }
}