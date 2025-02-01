package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class WheatActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat);
    }

    public void wheatIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.wheat_introduction);
    }

    public void wheatClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.wheat_climate);
    }

    public void wheatSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.wheat_soil);
    }

    public void wheatSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.wheat_sowing);
    }
    public void wheatLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.wheat_land_preparation);
    }

    public void wheatFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.wheat_fertilizers);
    }

    public void wheatDiseaseAndManagement(View view) {
        intLayout = 7;
        setContentView(R.layout.wheat_disease_and_management);
    }

    public void wheatHarvesting(View view) {
        intLayout = 8;
        setContentView(R.layout.wheat_harvesting);
    }

    public void wheatYield(View view) {
        intLayout = 9;
        setContentView(R.layout.wheat_yield);
    }

    @Override
    public void onBackPressed() {

        if(intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_wheat);
        }
        else {
            super.onBackPressed();
        }
    }
}