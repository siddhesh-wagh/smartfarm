package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        CardView news1 = findViewById(R.id.cardNews1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture/modern-tech-ai-and-sustainable-techniques-propelling-indian-agriculture-growth-watch/videoshow/99618375.cms"));
                startActivity(intent);
            }
        });

        CardView news2 = findViewById(R.id.cardNews2);
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture/about-1-5-lakh-farmers-practising-natural-farming-in-himachal-to-be-certified-under-pk3y-in-fy24/articleshow/99314688.cms"));
                startActivity(intent);
            }
        });

        CardView news3 = findViewById(R.id.cardNews3);
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.livemint.com/industry/agriculture/wheat-procurement-reaches-195-lakh-tonnes-so-far-in-2022-23-surpasses-previous-year-s-total-purchase-govt-11682608143520.html"));
                startActivity(intent);
            }
        });

        CardView news4 = findViewById(R.id.cardNews4);
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thehindu.com/news/national/andhra-pradesh/rains-damage-paddy-chilli-mango-and-turmeric-crops-in-andhra-pradesh/article66772951.ece"));
                startActivity(intent);
            }
        });

        CardView news5 = findViewById(R.id.cardNews5);
        news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thehindu.com/news/national/loss-in-wheat-production-not-huge-says-centre/article66707055.ece"));
                startActivity(intent);
            }
        });

        CardView news6 = findViewById(R.id.cardNews6);
        news6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture/small-farmers-to-benefit-from-this-budget-2023-agriculture-minister/articleshow/97531564.cms"));
                startActivity(intent);
            }
        });

        CardView news7 = findViewById(R.id.cardNews7);
        news7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture/govt-says-number-of-beneficiaries-under-pm-kisan-has-crossed-10-crore/articleshow/95667864.cms"));
                startActivity(intent);
            }
        });

        CardView news8 = findViewById(R.id.cardNews8);
        news8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thehindu.com/opinion/op-ed/india-uae-cooperation-to-sow-regional-food-security/article66756579.ece"));
                startActivity(intent);
            }
        });

        CardView news9 = findViewById(R.id.cardNews9);
        news9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture/government-sets-a-target-of-35-mt-for-wheat-procurement/articleshow/98342083.cms"));
                startActivity(intent);
            }
        });

        CardView news10 = findViewById(R.id.cardNews10);
        news10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/india/par-panel-pulls-up-agriculture-dept-for-surrender-of-rs-44016-cr-in-3-years-asks-to-utilise-budgeted-amount-fully/articleshow/98639110.cms"));
                startActivity(intent);
            }
        });

    }
}