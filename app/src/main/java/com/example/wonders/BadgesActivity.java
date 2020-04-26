package com.example.wonders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BadgesActivity extends AppCompatActivity {

    private ImageView china;
    private ImageView brazil;
    private ImageView india;
    private ImageView jordan;
    private ImageView machu;
    private ImageView maya;
    private ImageView rome;
    private ImageView finalBadge;
    private ImageView backArrow;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);

        china = findViewById(R.id.badgeCard1Image);
        brazil = findViewById(R.id.badgeCard2Image);
        india = findViewById(R.id.badgeCard3Image);
        jordan = findViewById(R.id.badgeCard4Image);
        machu = findViewById(R.id.badgeCard5Image);
        maya = findViewById(R.id.badgeCard6Image);
        rome = findViewById(R.id.badgeCard7Image);
        finalBadge = findViewById(R.id.badgeCard8Image);
        backArrow = findViewById(R.id.backArrow);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });



        if(SessionData.currentUser.isBadge1()){
            china.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            china.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge2()){
            brazil.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            brazil.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge3()){
            india.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            india.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge4()){
            jordan.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            jordan.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge5()){
            machu.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            machu.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge6()){
            maya.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            maya.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge7()){
            rome.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            rome.startAnimation(animation);
        }

        if(SessionData.currentUser.isBadge8()){
            finalBadge.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            finalBadge.startAnimation(animation);
        }

        //If all the badges are collected, you get rewarded with the final badge
        if (SessionData.currentUser.isBadge1()
                && SessionData.currentUser.isBadge2()
                && SessionData.currentUser.isBadge3()
                && SessionData.currentUser.isBadge4()
                && SessionData.currentUser.isBadge5()
                && SessionData.currentUser.isBadge6()
                && SessionData.currentUser.isBadge7()){
            SessionData.currentUser.setBadge8(true);
        }
    }

}
