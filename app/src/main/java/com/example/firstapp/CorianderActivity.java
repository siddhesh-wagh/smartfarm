package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class CorianderActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coriander);
    }

    public void corianderIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.coriander_intro);
    }

    public void corianderClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.coriander_climate);
    }

    public void corianderSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.coriander_soil);
    }

    public void corianderSowingAndSeed(View view) {
        intLayout = 4;
        setContentView(R.layout.coriander_sowing_and_seeding);
    }

    public void corianderLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.coriander_land_preparation);
    }

    public void corianderFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.coriander_fertilizers);
    }

    public void corianderDiseaseManagement(View view) {
        intLayout = 7;
        setContentView(R.layout.coriander_disease_management);
    }

    public void corianderHarvesting(View view) {
        intLayout = 8;
        setContentView(R.layout.coriander_harvesting);
    }

    public void corianderYield(View view) {
        intLayout = 9;
        setContentView(R.layout.coriander_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_coriander);
        } else {
            super.onBackPressed();
        }
    }
}