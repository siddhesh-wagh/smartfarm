package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class CauliflowerActivity extends AppCompatActivity {

    private int intLayout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cauliflower);
    }

    public void cauliflowerIntroduction(View view) {
        intLayout = 1;
        setContentView(R.layout.cauliflower_intro);
    }

    public void cauliflowerClimate(View view) {
        intLayout = 2;
        setContentView(R.layout.cauliflower_climate);
    }

    public void cauliflowerSoil(View view) {
        intLayout = 3;
        setContentView(R.layout.cauliflower_soil);
    }

    public void cauliflowerSeedTreatment(View view) {
        intLayout = 4;
        setContentView(R.layout.cauliflower_seed_treatment);
    }

    public void cauliflowerSeedRate(View view) {
        intLayout = 5;
        setContentView(R.layout.cauliflower_seed_rate);
    }

    public void cauliflowerIrrigation(View view) {
        intLayout = 6;
        setContentView(R.layout.cauliflower_irrigation);
    }


    public void cauliflowerDiseaseManagement(View view) {
        intLayout = 7;
        setContentView(R.layout.cauliflower_disease_management);
    }

    public void cauliflowerYield(View view) {
        intLayout = 8;
        setContentView(R.layout.cauliflower_yield);
    }

    @Override
    public void onBackPressed() {

        if (intLayout != 0) {
            intLayout = 0;
            setContentView(R.layout.activity_cauliflower);
        } else {
            super.onBackPressed();
        }
    }
}