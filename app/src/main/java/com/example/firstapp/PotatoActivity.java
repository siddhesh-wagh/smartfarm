package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PotatoActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);
    }

    public void potatoIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.potato_intro);
    }

    public void potatoSoilAndClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.potato_soil_and_climate);
    }

    public void potatoVarieties(View view) {
        intLayout = 3;
        setContentView(R.layout.potato_varieties);
    }

    public void potatoSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.potato_sowing);
    }

    public void potatoLandPreparationAndManuring(View view) {
        intLayout = 5;
        setContentView(R.layout.potato_land_preparation);
    }

    public void potatoFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.potato_fertilizers);
    }


    public void potatoDiseaseManagement(View view) {
        intLayout = 7;
        setContentView(R.layout.potato_disease_management);
    }

    public void potatoHarvestingAndYield(View view) {
        intLayout = 8;
        setContentView(R.layout.potato_harvesting_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_potato);
        } else {
            super.onBackPressed();
        }
    }
}