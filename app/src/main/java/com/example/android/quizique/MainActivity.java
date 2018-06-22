package com.example.android.quizique;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // creates methods that confirm the answer to each question

    private void question1 () {
        String correct_answer = "Chimdindu Aneke";
        EditText first_question = findViewById(R.id.first_answer);
        String firstAnswer = first_question.getText().toString();
        if (firstAnswer.equals(correct_answer)) {
            score = score + 1;
        }
    }

    private void question2 () {
        RadioButton second_question = findViewById(R.id.second_answer);
        boolean secondAnswer = second_question.isChecked();
        if (secondAnswer) {
            score = score + 1;
        }
    }

    private void question3 () {
        CheckBox third_questionA = findViewById(R.id.optionA);
        boolean option_A = third_questionA.isChecked();
        CheckBox third_questionB = findViewById(R.id.third_answer_a);
        boolean thirdAnswerA = third_questionB.isChecked();
        CheckBox third_questionC = findViewById(R.id.third_answer_b);
        boolean thirdAnswerB = third_questionC.isChecked();
        CheckBox third_questionD = findViewById(R.id.optionC);
        boolean option_C = third_questionD.isChecked();
        if (thirdAnswerA && thirdAnswerB && !option_A && !option_C) {
            score = score + 1;
        }
    }

    private void question4 () {
        RadioButton fourth_question = findViewById(R.id.fourth_answer);
        boolean fourthAnswer = fourth_question.isChecked();
        if (fourthAnswer) {
            score = score + 1;
        }
    }

    private void question5 () {
        RadioButton fifth_question = findViewById(R.id.fifth_answer);
        boolean fifthAnswer = fifth_question.isChecked();
        if (fifthAnswer) {
            score = score + 1;
        }
    }

    private void question6 () {
        RadioButton sixth_question = findViewById(R.id.sixth_answer);
        boolean sixthAnswer = sixth_question.isChecked();
        if (sixthAnswer) {
            score = score + 1;
        }
    }

    private void question7 () {
        RadioButton seventh_question = findViewById(R.id.seventh_answer);
        boolean seventhAnswer = seventh_question.isChecked();
        if (seventhAnswer) {
            score = score + 1;
        }
    }

    //creates a toast message

    public void toast (int i) {
        if (i == 7) {
            result = "Excellent! You scored" + " " + i + " " + "out of 7" ;
        } else if (i < 7 && i > 3) {
            result = "Good! You scored" + " " + i + " " + "out of 7" ;
        } else if (i < 4) {
            result = "You scored" + " " + i + " " + "out of 7. You can do better" ;
        }

        Toast.makeText(MainActivity.this,
                result, Toast.LENGTH_LONG).show();
    }

    // calls a method that checks the user's input and displays the final score

    public void submit (View view) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        toast(score);
        score = 0;
    }

}
