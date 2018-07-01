package com.example.root.mysqlquizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {
    int score = 0;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


    }

    public void submit(View view){
        EditText editText = (EditText) findViewById(R.id.edit_text);
        Editable editable = editText.getText();
        editable.toString();
        String correct_answer = "Hierachy, Object oriented, Tree";

        Context context = getApplicationContext();

        CheckBox ans1 = (CheckBox) findViewById(R.id.ans1);
        boolean isAnswer1 = ans1.isChecked();
        CheckBox ans2 = (CheckBox) findViewById(R.id.ans2);
        boolean isAnswer2 = ans2.isChecked();
        CheckBox ans3 = (CheckBox) findViewById(R.id.ans3);
        boolean isAnswer3 = ans3.isChecked();
        CheckBox ans4 = (CheckBox) findViewById(R.id.ans4);
        boolean isAnswer4 = ans4.isChecked();
        CheckBox ans5 = (CheckBox) findViewById(R.id.ans5);
        boolean isAnswer5 = ans5.isChecked();


        RadioButton answerTrue = (RadioButton) findViewById(R.id.t);
        boolean isTrue = answerTrue.isChecked();

        RadioButton answerFalse = (RadioButton) findViewById(R.id.f);
        boolean isFalse = answerFalse.isChecked();

        RadioButton answer3a = (RadioButton) findViewById(R.id.answer3a);
        boolean isAnswer3a = answer3a.isChecked();
        RadioButton answer3b = (RadioButton) findViewById(R.id.answer3b);
        boolean isAnswer3b = answer3b.isChecked();

        RadioButton answer4a = (RadioButton) findViewById(R.id.answer4a);
        boolean isAnswer4a = answer4a.isChecked();
        RadioButton answer4b = (RadioButton) findViewById(R.id.answer4b);
        boolean isAnswer4b = answer4b.isChecked();

        if(isTrue){
            score = score + 2;
        }else if(isFalse){
            score = score - 2;
        }
        if(isAnswer3b){
            score = score + 2;

        }else if(isAnswer3a){
            score = score - 2;
        }
        if(isAnswer4b){
            score = score + 2;
        }else if(isAnswer4a){
            score = score - 2;
        }if(isAnswer1){
            score = score + 2;
        }
        if (isAnswer2){
            score += 2;
        }

        if (isAnswer3){
            score += 2;
        }

        if (isAnswer4){
            score += 2;
        }

        if (isAnswer5){
            score += 2;
        }
        Toast toast = Toast.makeText(context, "Score " + score + " practice more.", Toast.LENGTH_LONG);
        toast.show();

    }
    public void calculateScore(){


    }

}
