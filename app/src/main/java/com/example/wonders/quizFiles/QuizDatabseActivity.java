package com.example.wonders.quizFiles;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wonders.MainActivity;
import com.example.wonders.R;

import java.util.ArrayList;

public class QuizDatabseActivity extends AppCompatActivity {

    //Reference Link: https://www.youtube.com/watch?v=5ISNPFmuOU8

    public RadioButton btn1;
    public RadioButton btn2;
    public RadioButton btn3;
    public RadioButton btn4;

    public RadioGroup radioGroup;

    public Button next;
    public Button mark;
    private boolean answered;
    public TextView question;
    private TextView status;
    private TextView correctScore;
    public TextView currentScore;
    public ColorStateList textColorDefaultRb;

    //items we need

    ArrayList<QuizOptions> options;
    private int questionCounter = 0;
    private int questionCountTotal = 0;
    private int score = 0;
    private int correctCount;
    private QuizOptions currentQuestion;

    Dialog gameOverDialogue;
    Animation animation;

    Button answer1, answer2, answer3, answer4, tryAgain, exit;
    TextView scorePopUp;
    ImageView close, badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_databse);


        btn1= findViewById(R.id.option1);
        btn2 = findViewById(R.id.option2);
        btn3= findViewById(R.id.option3);
        btn4 = findViewById(R.id.option4);

        radioGroup = findViewById(R.id.radioGroup);
        question = findViewById(R.id.question);
        mark = findViewById(R.id.nextQuestion);
        textColorDefaultRb = btn1.getTextColors();
        status = findViewById(R.id.correct);
        currentScore = findViewById(R.id.userScore);
        correctScore = findViewById(R.id.correctNumber);


        //invisible labels

        currentScore.setVisibility(View.INVISIBLE);
        status.setVisibility(View.INVISIBLE);
        correctScore.setVisibility(View.INVISIBLE);

        //get q's

        options = QuizBank.getOptions(QuizTopics.name);

        //counts amount of options objects
        questionCountTotal = options.size();

        //shows next question
        refreshQuestion();

        //do following when clicked
        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) { //if the question was not answered
                    if (btn1.isChecked() || btn2.isChecked() || btn3.isChecked() || btn4.isChecked()) {
                        markQuestion(); //if any of the radio buttons are selected, check the answer
                    } else {
                        Toast.makeText(QuizDatabseActivity.this, "Please Select an Answer", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    refreshQuestion();//show next question
                    status.setText("");
                }
            }
        });
    }
    //show next question
    private void refreshQuestion() {
        //sets radio button text colour to default
        btn1.setTextColor(textColorDefaultRb);
        btn2.setTextColor(textColorDefaultRb);
        btn3.setTextColor(textColorDefaultRb);
        btn4.setTextColor(textColorDefaultRb);
        radioGroup.clearCheck(); //clears check

        //if questions still remaining
        if (questionCounter < questionCountTotal) {
            currentQuestion = options.get(questionCounter);
            //set question textview and option radio buttons
            question.setText(currentQuestion.getQuestion());
            btn1.setText(currentQuestion.getOption1());
            btn2.setText(currentQuestion.getOption2());
            btn3.setText(currentQuestion.getOption3());
            btn4.setText(currentQuestion.getOption4());

            //add 1 to question counter
            questionCounter++;
            answered = false;
            mark.setText("Confirm");
        } else {
            //close quiz activity
            finish();
        }
    }
    private void markQuestion() {
        answered = true;

        //get id of selected radiobutton
        int selectedId = radioGroup.getCheckedRadioButtonId();

        //find radiobutton selected
        RadioButton radioButtonSelected = findViewById(selectedId);

        //get index of radiobutton and add 1, assign it to the option number chosen
        int answerNo = radioGroup.indexOfChild(radioButtonSelected) + 1;

        //If the answer selected is correct
        if (answerNo == currentQuestion.getAnswerNumber()) {
            score ++; //increase score by 1
            correctCount++; //increases number of correct questions by 1
            currentScore.setVisibility(View.VISIBLE);
            currentScore.setText(String.valueOf(score));
        }

        showAnswer();

    }

    private void showAnswer() {
        //sets radio button text as red
        btn1.setTextColor(Color.RED);
        btn2.setTextColor(Color.RED);
        btn3.setTextColor(Color.RED);
        btn4.setTextColor(Color.RED);

        //makes label for correct answer as visible
        status.setVisibility(View.VISIBLE);

        //displays correct answer
        switch (currentQuestion.getAnswerNumber()) {
            case 1:
                btn1.setTextColor(Color.GREEN);
                status.setText("Answer 1 is Correct!");
                break;
            case 2:
                btn2.setTextColor(Color.GREEN);
                status.setText("Answer 2 is Correct!");
                break;
            case 3:
                btn3.setTextColor(Color.GREEN);
                status.setText("Answer 3 is Correct!");
                break;
            case 4:
                btn4.setTextColor(Color.GREEN);
                status.setText("Answer 4 is Correct!");
                break;
        }
        if (questionCounter < questionCountTotal) {
            mark.setText("Next Question");
            //refreshQuestion();
        } else {
            mark.setText("Finish Quiz");
            finishQuiz();
        }


    }

    //finish quiz
    private void finishQuiz() {
        //displays correct score
        correctScore.setVisibility(View.VISIBLE);
        correctScore.setText("Your Score: " + correctCount + " / 5 ");

        //collect badge popup
        /*if(correctCount ==5) {
            congratulations();
        }*/


        //take user to landing page
        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }


        });

    }

    private void congratulations() {

        gameOverDialogue.setContentView(R.layout.congrats_popup_box);
        close = (ImageView) gameOverDialogue.findViewById(R.id.close);
        tryAgain= (Button) gameOverDialogue.findViewById(R.id.tryAgainBtn);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameOverDialogue.dismiss();
            }
        });
        rotateAnimation();
        gameOverDialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        gameOverDialogue.show();
    }

    private void rotateAnimation() {
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        badge.startAnimation(animation);
    }
}
