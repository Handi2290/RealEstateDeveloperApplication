package com.example.realestatedeveloperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.util.Random;

public class RealEstatePricePredictor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_estate_price_predictor);

    }

    public void predictButton(View v) {
        Intent i = new Intent(this,PredictPriceResult.class);
        startActivity(i);
    }

}

