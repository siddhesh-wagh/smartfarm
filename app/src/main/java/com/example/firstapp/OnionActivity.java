package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class OnionActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onion);
    }

    public void onionIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.onion_intro);
    }

    public void onionClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.onion_climate);
    }

    public void onionSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.onion_soil);
    }

    public void onionSowingAndSeed(View view) {
        intLayout = 4;
        setContentView(R.layout.onion_sowing_and_seed);
    }

    public void onionMethodOfSowing(View view) {
        intLayout = 5;
        setContentView(R.layout.onion_method_of_sowing);
    }

    public void onionLandPreparation(View view) {
        intLayout = 6;
        setContentView(R.layout.onion_land_preparation);
    }

    public void onionFertilizers(View view) {
        intLayout = 7;
        setContentView(R.layout.onion_fertilizers);
    }

    public void onionDiseaseManagement(View view) {
        intLayout = 8;
        setContentView(R.layout.onion_disease_management);
    }

    public void onionHarvesting(View view) {
        intLayout = 9;
        setContentView(R.layout.onion_harvesting);
    }

    public void onionYield(View view) {
        intLayout = 10;
        setContentView(R.layout.onion_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_onion);
        } else {
            super.onBackPressed();
        }
    }
}