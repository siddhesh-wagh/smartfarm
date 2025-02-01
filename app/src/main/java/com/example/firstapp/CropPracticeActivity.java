package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CropPracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_practice);

        CardView wheat = findViewById(R.id.cardWheat);
        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, WheatActivity.class));
            }
        });

        CardView paddy = findViewById(R.id.cardPaddy);
        paddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, PaddyActivity.class));
            }
        });

        CardView maize = findViewById(R.id.cardMaize);
        maize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, MaizeActivity.class));
            }
        });

        CardView pearlMillet = findViewById(R.id.cardPearlMillet);
        pearlMillet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, PearlMilletActivity.class));
            }
        });

        CardView tomato = findViewById(R.id.cardTomatto);
        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, TomatoActivity.class));
            }
        });

        CardView cauliflower = findViewById(R.id.cardCaluliflower);
        cauliflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, CauliflowerActivity.class));
            }
        });

        CardView potato = findViewById(R.id.cardPotato);
        potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, PotatoActivity.class));
            }
        });

        CardView brinjal = findViewById(R.id.cardBrinjal);
        brinjal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, BrinjalActivity.class));
            }
        });

        CardView cabbage = findViewById(R.id.cardCabbage);
        cabbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, CabbageActivity.class));
            }
        });

        CardView chilli = findViewById(R.id.cardChilli);
        chilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, ChilliActivity.class));
            }
        });

        CardView onion = findViewById(R.id.cardOnion);
        onion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, OnionActivity.class));
            }
        });

        CardView coriander = findViewById(R.id.cardCoriander);
        coriander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CropPracticeActivity.this, CorianderActivity.class));
            }
        });


    }
}