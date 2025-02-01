package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ChilliActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chilli);
    }

    public void chilliIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.chilli_intro);
    }

    public void chilliClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.chilli_climate);
    }

    public void chilliSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.chilli_soil);
    }

    public void chilliSowingAndSeed(View view) {
        intLayout = 4;
        setContentView(R.layout.chilli_sowing_and_seed);
    }

    public void chilliLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.chilli_land_preparation);
    }

    public void chilliDiseaseManagement(View view) {
        intLayout = 6;
        setContentView(R.layout.chilli_disease_management);
    }

    public void chilliHarvest(View view) {
        intLayout = 7;
        setContentView(R.layout.chilli_harvest);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_chilli);
        } else {
            super.onBackPressed();
        }
    }
}