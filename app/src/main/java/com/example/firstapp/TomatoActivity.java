package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class TomatoActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
    }

    public void tomatoIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.tomato_introduction);
    }

    public void tomatoClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.tomato_climate);
    }

    public void tomatoSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.tomato_soil);
    }

    public void tomatoSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.tomato_sowing);
    }

    public void tomatoLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.tomato_land_preparation);
    }

    public void tomatoFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.tomato_fertilizers);
    }


    public void tomatoDiseaseManagement(View view) {
        intLayout = 7;
        setContentView(R.layout.tomato_disease_management);
    }

    public void tomatoHarvesting(View view) {
        intLayout = 8;
        setContentView(R.layout.tomato_harvesting);
    }

    public void tomatoYield(View view) {
        intLayout = 9;
        setContentView(R.layout.tomato_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_tomato);
        } else {
            super.onBackPressed();
        }
    }
}