package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wonders.R;
import com.example.wonders.Data.SessionData;
import com.luolc.emojirain.EmojiRainLayout;

public class BadgesActivity extends AppCompatActivity {

    //Here is the activity where all the badges are collected

    private ImageView china;
    private ImageView brazil;
    private ImageView india;
    private ImageView jordan;
    private ImageView machu;
    private ImageView maya;
    private ImageView rome;
    private ImageView finalBadge;
    private ImageView backArrow;
    private TextView congrats;
    Animation animation;
    private EmojiRainLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);

        //Special easter egg if all 8 badges are collected
        theWonderer();

        china = findViewById(R.id.badgeCard1Image);
        brazil = findViewById(R.id.badgeCard2Image);
        india = findViewById(R.id.badgeCard3Image);
        jordan = findViewById(R.id.badgeCard4Image);
        machu = findViewById(R.id.badgeCard5Image);
        maya = findViewById(R.id.badgeCard6Image);
        rome = findViewById(R.id.badgeCard7Image);
        finalBadge = findViewById(R.id.badgeCard8Image);
        backArrow = findViewById(R.id.backArrow);
        congrats = findViewById(R.id.textLanding);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BadgesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //If the status of the badge is true, it will be visible again and load an animation
        if (SessionData.currentUser.isBadge1()) {
            china.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            china.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge2()) {
            brazil.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            brazil.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge3()) {
            india.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            india.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge4()) {
            jordan.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            jordan.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge5()) {
            machu.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            machu.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge6()) {
            maya.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            maya.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge7()) {
            rome.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            rome.startAnimation(animation);
        }

        if (SessionData.currentUser.isBadge8()) {
            finalBadge.setVisibility(View.VISIBLE);
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            congrats.setText("Congratulations on becoming the Wonderer! ");
            finalBadge.startAnimation(animation);
            mContainer.startDropping();
        }

        //If all the badges are collected, you get rewarded with the final badge
        if (SessionData.currentUser.isBadge1()
                && SessionData.currentUser.isBadge2()
                && SessionData.currentUser.isBadge3()
                && SessionData.currentUser.isBadge4()
                && SessionData.currentUser.isBadge5()
                && SessionData.currentUser.isBadge6()
                && SessionData.currentUser.isBadge7()) {
            SessionData.currentUser.setBadge8(true);
        }
    }


    /*https://github.com/Luolc/EmojiRain
    Year:2016
    Author: Liangchen Luo
     */
    //Fun animation which rewards the student for completing all the quizzes
    //All the badges will be raining down across the screen

    public void theWonderer(){
        mContainer = findViewById(R.id.group_emoji_container);

        // add emoji sources
        mContainer.addEmoji(R.drawable.china);
        mContainer.addEmoji(R.drawable.india);
        mContainer.addEmoji(R.drawable.jordan);
        mContainer.addEmoji(R.drawable.brazil);
        mContainer.addEmoji(R.drawable.maya);
        mContainer.addEmoji(R.drawable.picchu);
        mContainer.addEmoji(R.drawable.rome);
        mContainer.addEmoji(R.drawable.badge);

        // set emojis per flow, default 6
        mContainer.setPer(10);

        // set total duration in milliseconds, default 8000
        mContainer.setDuration(7200);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(2400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(500);
    }

}
