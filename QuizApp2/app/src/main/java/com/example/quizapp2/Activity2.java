package com.example.quizapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private int score;
    private RadioGroup group1;
    private RadioGroup group2;
    private RadioGroup group3;
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private CheckBox box4;
    private EditText ans5;
    private int countIncorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void count(View view) {
        group1 = (RadioGroup) findViewById(R.id.button1);
        if (group1.getCheckedRadioButtonId() == R.id.q1a) {
            score += 20;
        }
        if (group1.getCheckedRadioButtonId() != R.id.q1a) {
            countIncorrect++;
        }
        group2 = (RadioGroup) findViewById(R.id.button2);
        if (group2.getCheckedRadioButtonId() == R.id.q2d) {
            score += 20;
        }
        if (group2.getCheckedRadioButtonId() != R.id.q2d) {
            countIncorrect++;
        }
        group3 = (RadioGroup) findViewById(R.id.button3);
        if (group3.getCheckedRadioButtonId() == R.id.q3b) {
            score += 20;
        }
        if (group3.getCheckedRadioButtonId() != R.id.q3b) {
            countIncorrect++;
        }
        box1 = (CheckBox) findViewById(R.id.q4a);
        box2 = (CheckBox) findViewById(R.id.q4b);
        box3 = (CheckBox) findViewById(R.id.q4c);
        box4 = (CheckBox) findViewById(R.id.q4d);
        ans5 = (EditText) findViewById(R.id.answer5);
        String answer5 = ans5.getText().toString().trim();

        if (box2.isChecked() && box3.isChecked() && box4.isChecked() && !box1.isChecked()) {
            score += 20;
        }
        if (box1.isChecked() || !box2.isChecked() || !box3.isChecked() || !box4.isChecked()) {
            countIncorrect++;
        }
        if (answer5.equalsIgnoreCase("frank")) {
            score += 20;
        }
        if (!(answer5.equalsIgnoreCase("frank"))) {
            countIncorrect++;
        }
        if (score == 100) {
            Toast.makeText(this, "Congratulations! You got 100!", Toast.LENGTH_SHORT).show();
            score = 0;
            countIncorrect = 0;
        } else if (score == 75) {
            Toast.makeText(this, "Welldone! You got 75 and you have " + countIncorrect + " wrong", Toast.LENGTH_SHORT).show();
            score = 0;
            countIncorrect = 0;
        } else {
            Toast.makeText(this, "You got " + score + " and you have " + countIncorrect + " question wrong, Try again!", Toast.LENGTH_SHORT).show();
            score = 0;
            countIncorrect = 0;
        }
    }
}
