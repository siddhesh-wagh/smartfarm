package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PaddyActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paddy);
    }

    public void paddyIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.paddy_introduction);
    }

    public void paddyClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.wheat_climate);
    }

    public void paddySoil(View view) {
        intLayout = 3;
        setContentView(R.layout.paddy_soil);
    }

    public void paddySowing(View view) {
        intLayout = 4;
        setContentView(R.layout.paddy_sowing);
    }

    public void paddyLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.paddy_land_preparation);
    }

    public void paddyFertilizers(View view) {
        intLayout = 6;
        setContentView(R.layout.paddy_fertilizers);
    }

    public void paddyIrrigation(View view) {
        intLayout = 7;
        setContentView(R.layout.paddy_irrigation);
    }

    public void paddyDiseaseManagement(View view) {
        intLayout = 8;
        setContentView(R.layout.paddy_diseases_and_management);
    }

    public void paddyHarvesting(View view) {
        intLayout = 9;
        setContentView(R.layout.paddy_harvesting);
    }

    public void paddyYield(View view) {
        intLayout = 10;
        setContentView(R.layout.paddy_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_paddy);
        } else {
            super.onBackPressed();
        }
    }
}