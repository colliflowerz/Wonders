package com.example.wonders.quizFiles;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wonders.BadgesActivity;
import com.example.wonders.MainActivity;
import com.example.wonders.R;
import com.example.wonders.SessionData;

import org.w3c.dom.Text;

import java.util.Random;

public class GreatWallQuizActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4, tryAgain, exit;
    TextView score, question, scorePopUp;
    ImageView close, badge;
    Dialog gameOverDialogue;
    Animation animation;

    private greatWallQuestions mQuestions = new greatWallQuestions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // setting up pop up

        gameOverDialogue =new Dialog(this);


        //quiz
        r= new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: " + mScore+"/5");

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answer1.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore+"/5");
                    if(mScore!=5){
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        congratulations();
                    }

                } else {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answer2.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore+"/5");
                    if(mScore!=5){
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        congratulations();
                    }
                } else {
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answer3.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore+"/5");
                    if(mScore!=5){
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        congratulations();
                    }
                } else {
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answer4.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore+"/5");
                    if(mScore!=5){
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        congratulations();
                    }
                } else {
                    gameOver();
                }

            }
        });

        if (mScore==5){
            congratulations();
        }

    }



    private void updateQuestion (int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void congratulations() {

        gameOverDialogue.setContentView(R.layout.congrats_popup_box);
        close = (ImageView) gameOverDialogue.findViewById(R.id.close);
        badge = (ImageView) gameOverDialogue.findViewById(R.id.badge);
        tryAgain= (Button) gameOverDialogue.findViewById(R.id.tryAgainBtn);
        badge.setImageResource(R.drawable.china);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameOverDialogue.dismiss();
            }
        });
        rotateAnimation();
        gameOverDialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        SessionData.currentUser.setBadge1(true);
        //Update the badge status in the database
        SessionData.mUserDatabase.userDao().updateBadge1(SessionData.currentUser.getUsername());
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BadgesActivity.class);
                startActivity(intent);
            }
        });
        gameOverDialogue.show();
    }

    public void gameOver() {
        gameOverDialogue.setContentView(R.layout.quiz_popup_box);
        close = (ImageView) gameOverDialogue.findViewById(R.id.close);
        tryAgain= (Button) gameOverDialogue.findViewById(R.id.tryAgainBtn);
        exit = (Button) gameOverDialogue.findViewById(R.id.exitBtn);

        scorePopUp = (TextView) gameOverDialogue.findViewById(R.id.score);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameOverDialogue.dismiss();
            }
        });


        gameOverDialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        scorePopUp.setText("Your score is: " + mScore);
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GreatWallQuizActivity.class));
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuizTopics.class));
            }
        });
        gameOverDialogue.show();

    }

    private void rotateAnimation() {
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        badge.startAnimation(animation);
    }

}
