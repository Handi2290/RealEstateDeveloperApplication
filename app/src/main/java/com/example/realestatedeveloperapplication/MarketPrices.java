package com.example.realestatedeveloperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MarketPrices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_prices);

        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://www.google.com/search?tbm=shop&sxsrf=APq-WBsdDIkKm5p-wIFFZfzN3etWtn8f-Q:1644845297393&q=bahan+bangunan+2022&tbs=mr:1,merchagg:g113899229%7Cg120851479%7Cm398848007%7Cm131154687%7Cm283110935%7Cm396089639%7Cm460184648,sales:1&sa=X&ved=0ahUKEwi_rKSdpv_1AhXmyjgGHY-AB2YQsysI2QcoAA&biw=1536&bih=714&dpr=1.25");
        web.setWebViewClient(new WebViewClient());
    }

}