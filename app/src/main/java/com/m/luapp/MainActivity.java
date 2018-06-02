package com.m.luapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
        WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wb = (WebView) findViewById(R.id.lu_web);

        WebSettings wb_s = wb.getSettings();

        wb_s.setJavaScriptEnabled(true);

        wb.setWebViewClient(new WebViewClient());

        wb.loadUrl("http://www.lus.ac.bd/");
    }
}
