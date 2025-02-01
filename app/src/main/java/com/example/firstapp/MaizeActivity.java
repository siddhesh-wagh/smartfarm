package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MaizeActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maize);
    }

    public void maizeIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.maize_introduction);
    }

    public void maizeClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.maize_climate);
    }

    public void maizeSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.maize_soil);
    }

    public void maizeSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.maize_sowing_and_seed);
    }

    public void maizeLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.maize_land_prepartion);
    }

    public void maizeFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.maize_fertilizers);
    }

    public void maizeIrrigation(View view) {
        intLayout = 7;
        setContentView(R.layout.maize_irrigation);
    }

    public void maizeDiseaseManagement(View view) {
        intLayout = 8;
        setContentView(R.layout.maize_disease_management);
    }

    public void maizeHarvesting(View view) {
        intLayout = 8;
        setContentView(R.layout.maize_harvesting);
    }

    public void maizeYield(View view) {
        intLayout = 9;
        setContentView(R.layout.maize_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_maize);
        } else {
            super.onBackPressed();
        }
    }
}