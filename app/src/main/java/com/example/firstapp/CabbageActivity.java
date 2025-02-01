package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class CabbageActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabbage);
    }

    public void cabbageIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.cabbage_intro);
    }

    public void cabbageClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.cabbage_climate);
    }

    public void cabbageSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.cabbage_soil);
    }

    public void cabbageSeasonOfSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.cabbage_season_of_sowing);
    }

    public void cabbageSeedTreatment(View view) {
        intLayout = 5;
        setContentView(R.layout.cabbage_seed_treatment);
    }

    public void cabbageSeedRate(View view) {
        intLayout = 6;
        setContentView(R.layout.cabbage_seed_rate);
    }

    public void cabbageLandPreparation(View view) {
        intLayout = 7;
        setContentView(R.layout.cabbage_land_preparation);
    }

    public void cabbageDiseaseManagement(View view) {
        intLayout = 8;
        setContentView(R.layout.cabbage_disease_management);
    }

    public void cabbageHarvesting(View view) {
        intLayout = 9;
        setContentView(R.layout.cabbage_harvesting);
    }

    public void cabbageYield(View view) {
        intLayout = 10;
        setContentView(R.layout.cabbage_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_cabbage);
        } else {
            super.onBackPressed();
        }
    }
}