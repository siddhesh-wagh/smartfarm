package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PearlMilletActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pearl_millet);
    }

    public void pearlMilletIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.pearl_millet_introduction);
    }

    public void pearlMilletClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.pearl_millet_climate);
    }

    public void pearlMilletSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.pearl_millet_soil);
    }

    public void pearlMilletSowing(View view) {
        intLayout = 4;
        setContentView(R.layout.pearl_millet_sowing_seed);
    }

    public void pearlMilletLandPreparation(View view) {
        intLayout = 5;
        setContentView(R.layout.pearl_millet_land_preparation);
    }

    public void pearlMilletDiseaseManagement(View view) {
        intLayout = 6;
        setContentView(R.layout.pearl_millet_diseases);
    }

    public void pearlMilletHarvesting(View view) {
        intLayout = 7;
        setContentView(R.layout.pearl_millet_harvesting);
    }

    public void pearlMilletYield(View view) {
        intLayout = 8;
        setContentView(R.layout.pearl_millet_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_pearl_millet);
        } else {
            super.onBackPressed();
        }
    }
}