package com.example.realestatedeveloperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Methods to move to different feature screens from Main Dashboard
    public void DocumentsActivity(View v) {
        Intent i = new Intent(this,DocumentsManagement.class);
        startActivity(i);
    }

    public void PersonnelActivity(View v) {
        Intent i = new Intent(this,PersonnelManagement.class);
        startActivity(i);
    }

    public void ProjectsActivity(View v) {
        Intent i = new Intent(this,ProjectsManagement.class);
        startActivity(i);
    }

    public void TasksActivity(View v) {
        Intent i = new Intent(this,TasksManagement.class);
        startActivity(i);
    }

    public void NotebookActivity(View v) {
        Intent i = new Intent(this,Notebook.class);
        startActivity(i);
    }

    public void MarketPricesActivity(View v) {
        Intent i = new Intent(this,MarketPrices.class);
        startActivity(i);
    }

    public void RealEstatePricePredictorActivity(View v) {
        Intent i = new Intent(this,RealEstatePricePredictor.class);
        startActivity(i);
    }

//    public void RealEstatePricePredictorActivity(View v)
//    {
//        try {
//            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
//            String keyword= "Real Estate Price";
//            intent.putExtra(SearchManager.QUERY, keyword);
//            startActivity(intent);
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//
//    }

}