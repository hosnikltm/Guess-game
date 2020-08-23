package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnswerActivity extends AppCompatActivity {

    private TextView mTextViewAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        mTextViewAnswer = findViewById(R.id.textViewAnswerTrue);

        String answer = getIntent().getStringExtra(Constants.QUESTION_ANSWER);
        if (answer != null){
            mTextViewAnswer.setText(answer);
        }
    }

    public void returnButton(View view) {
        finish();
    }
}