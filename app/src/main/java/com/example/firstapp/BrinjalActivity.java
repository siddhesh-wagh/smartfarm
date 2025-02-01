package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class BrinjalActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brinjal);
    }

    public void brinjalIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.brinjal_intro);
    }

    public void brinjalClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.brinjal_climate);
    }

    public void brinjalLandSlectionAndPreparation(View view) {
        intLayout = 3;
        setContentView(R.layout.brinjal_land_selection_and_preparation);
    }

    public void brinjalVarieties(View view) {
        intLayout = 4;
        setContentView(R.layout.brinjal_varieties);
    }

    public void brinjalSeedTreatment(View view) {
        intLayout = 5;
        setContentView(R.layout.brinjal_seed_treatment);
    }

    public void brinjalSeedRate(View view) {
        intLayout = 6;
        setContentView(R.layout.brinjal_seed_rate);
    }

    public void brinjalWaterManageent(View view) {
        intLayout = 7;
        setContentView(R.layout.brinjal_water_management);
    }

    public void brinjalDiseaseManagement(View view) {
        intLayout = 8;
        setContentView(R.layout.brinjal_disease_management);
    }

    public void brinjalHarvesting(View view) {
        intLayout = 9;
        setContentView(R.layout.brinjal_harvesting);
    }

    public void brinjalYield(View view) {
        intLayout = 10;
        setContentView(R.layout.brinjal_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_brinjal);
        } else {
            super.onBackPressed();
        }
    }
}