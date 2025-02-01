package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private ViewFlipper flipper;
    private final int MIN_SWIPE_DISTANCE = 120;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cropPractices = findViewById(R.id.cardCropPractices);
        cropPractices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, CropPracticeActivity.class));
            }
        });

        CardView weather = findViewById(R.id.cardWeather);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, WeatherActivity.class));
            }
        });

        CardView news = findViewById(R.id.cardNews);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, NewsActivity.class));
            }
        });

        CardView diseaseDetect = findViewById(R.id.cardDiseaseDetect);
        diseaseDetect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, DiseaseDetectActivity.class));
            }
        });

        int imgarray[] = {R.drawable.four, R.drawable.five, R.drawable.one, R.drawable.two, R.drawable.three};
        flipper = findViewById(R.id.flipper);

        // Add images to the flipper
        for (int i = 0; i < imgarray.length; i++) {
            showImage(imgarray[i]);
        }

        // Set up gesture detector
        gestureDetector = new GestureDetector(this, this);

        // Set automatic flipping
        flipper.setFlipInterval(5000);
        flipper.setAutoStart(true);

        // Set animation
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        // Swipe left (previous image)
        if (e1.getX() - e2.getX() > MIN_SWIPE_DISTANCE) {
            flipper.showPrevious();
        }
        // Swipe right (next image)
        else if (e2.getX() - e1.getX() > MIN_SWIPE_DISTANCE) {
            flipper.showNext();
        }
        return true;
    }

    // Required interface methods (not used in this example)
    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    public void showImage(int img) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);
        flipper.addView(imageView);
    }
}