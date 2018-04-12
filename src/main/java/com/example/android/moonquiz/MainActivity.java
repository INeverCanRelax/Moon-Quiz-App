package com.example.android.moonquiz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreRightCounter = 0;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetApp();
    }

    /**
     * These methods are called when the Enter, Quit, Reset, or Submit buttons are clicked.
     */
    public void enterButton(View view) {

        Context context = this;
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);


        EditText inputTxt = findViewById(R.id.name);
        name = inputTxt.getText().toString();
    }

    public void checkboxButton(View view) {
        EditText inputTxt = findViewById(R.id.name);
        CheckBox checkBox = findViewById(R.id.checkBox_anon);

        if(checkBox.isChecked()) {
            inputTxt.setFocusable(false); // to disable editing
            name =  getString(R.string.anon);
        }
        else {
            inputTxt.setFocusableInTouchMode(true);
            checkBox.setChecked(false);
        }
    }

    public void quitButton(View v) {
        finish();
        System.exit(0);

    }
    public void resetButton(View v) {
        resetApp();
    }
    public void submitAnswersButton(View v) {
        getAllAnswers();

        ScrollView scrollView = findViewById(R.id.scroll_view_main);
        scrollView.fullScroll(ScrollView.FOCUS_UP);

        Button button = findViewById(R.id.submit_button);
        button.setClickable(false);

        double testScore = ((scoreRightCounter * 100) / 10);
        int duration = Toast.LENGTH_LONG;

        String text = "Name: " + name;
        text += "\n\nYou got " + scoreRightCounter + " right!";
        String error = "Error obtaining scores!";

        text += "\n\nHere's your score: " + testScore;

        if (scoreRightCounter == 10){
            String message1 = getString(R.string.perfectScore);
            text += "\n\n" + message1;
        }
        else if (scoreRightCounter > 7) {
            String message2 = getString(R.string.greatScore);
            text += "\n\n" + message2;
        }
        else if (scoreRightCounter > 5){
            String message3 = getString(R.string.averageScore);
            text += "\n" + message3;
        }
        else if (scoreRightCounter < 5){
            String message4 = getString(R.string.belowAverageScore);
            text += "\n\n" + message4;
        }
        else if (scoreRightCounter == 0){
            String message5 = getString(R.string.belowAverageScore);
            text += "\n\n" + message5;
        }
        else
            text += "\n\n" + error;

        Toast toast = Toast.makeText(this, text, duration);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(32);
        toast.setGravity(Gravity.CENTER, 0, duration);
        toast.show();
    }

    /**
     * Checks the answers.
     */
    public void check1() {
        RadioButton correct = findViewById(R.id.rbutton_1B);
        String string1 = getString(R.string.solution1);
        TextView s1 = findViewById(R.id.s1);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s1.setText(string1);
        }
        else {
            s1.setText(string1);
        }
    }

    public void check2() {
        RadioButton correct = findViewById(R.id.rbutton_2A);
        String string2 = getString(R.string.solution2);
        TextView s2 = findViewById(R.id.s2);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s2.setText(string2);
        }
        else {
            s2.setText(string2);
        }
    }

    public void check3() {
        RadioButton correct = findViewById(R.id.rbutton_3D);
        String string3 = getString(R.string.solution3);
        TextView s3 = findViewById(R.id.s3);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s3.setText(string3);
        }
        else {
            s3.setText(string3);
        }
    }

    public void check4() {
        RadioButton correct = findViewById(R.id.rbutton_4B);
        String string4 = getString(R.string.solution4);
        TextView s4 = findViewById(R.id.s4);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s4.setText(string4);
        }
        else {
            s4.setText(string4);
        }
    }

    public void check5() {
        RadioButton correct = findViewById(R.id.rbutton_5C);
        String string5 = getString(R.string.solution5);
        TextView s5 = findViewById(R.id.s5);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s5.setText(string5);
        }
        else {
            s5.setText(string5);
        }
    }

    public void check6() {
        RadioButton correct = findViewById(R.id.rbutton_6D);
        String string6 = getString(R.string.solution6);
        TextView s6 = findViewById(R.id.s6);

        if (correct.isChecked()) {
            s6.setText(string6);
            scoreRightCounter+=1;
        }
        else {
            s6.setText(string6);
        }
    }

    public void check7() {
        RadioButton correct = findViewById(R.id.rbutton_7A);
        String string7 = getString(R.string.solution7);
        TextView s7 = findViewById(R.id.s7);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s7.setText(string7);
        }
        else {
            s7.setText(string7);
        }
    }

    public void check8() {
        RadioButton correct = findViewById(R.id.rbutton_8D);
        String string8 = getString(R.string.solution8);
        TextView s8 = findViewById(R.id.s8);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s8.setText(string8);
        }
        else {
            s8.setText(string8);
        }
    }

    public void check9() {
        RadioButton correct = findViewById(R.id.rbutton_9B);
        String string9 = getString(R.string.solution9);
        TextView s9 = findViewById(R.id.s9);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s9.setText(string9);
        }
        else {
            s9.setText(string9);
        }
    }

    public void check10() {
        RadioButton correct = findViewById(R.id.rbutton_10D);
        Button button = findViewById(R.id.submit_button);
        String string10 = getString(R.string.solution10);
        TextView s10 = findViewById(R.id.s10);

        if (correct.isChecked()) {
            scoreRightCounter+=1;
            s10.setText(string10);
        }
        else {
            s10.setText(string10);
        }

        button.setClickable(true);
    }


    /**
     * Calls all the check methods.
     */
    public void getAllAnswers() {
        check1();
        check2();
        check3();
        check4();
        check5();
        check6();
        check7();
        check8();
        check9();
        check10();
    }

    /**
     * Resets the default values of the app.
     */
    private void resetApp() {
        scoreRightCounter = 0;
        name = "";

        Button button = findViewById(R.id.submit_button);

        TextView s1 = findViewById(R.id.s1);
        TextView s2 = findViewById(R.id.s2);
        TextView s3 = findViewById(R.id.s3);
        TextView s4 = findViewById(R.id.s4);
        TextView s5 = findViewById(R.id.s5);
        TextView s6 = findViewById(R.id.s6);
        TextView s7 = findViewById(R.id.s7);
        TextView s8 = findViewById(R.id.s8);
        TextView s9 = findViewById(R.id.s9);
        TextView s10 = findViewById(R.id.s10);

        RadioButton r1 = findViewById(R.id.rbutton_1A);
        RadioButton r2 = findViewById(R.id.rbutton_1B);
        RadioButton r3 = findViewById(R.id.rbutton_1C);
        RadioButton r4 = findViewById(R.id.rbutton_1D);

        RadioButton r5 = findViewById(R.id.rbutton_2A);
        RadioButton r6 = findViewById(R.id.rbutton_2B);
        RadioButton r7 = findViewById(R.id.rbutton_2C);
        RadioButton r8 = findViewById(R.id.rbutton_2D);

        RadioButton r9 = findViewById(R.id.rbutton_3A);
        RadioButton r10 = findViewById(R.id.rbutton_3B);
        RadioButton r11 = findViewById(R.id.rbutton_3C);
        RadioButton r12 = findViewById(R.id.rbutton_3D);

        RadioButton r13 = findViewById(R.id.rbutton_4A);
        RadioButton r14 = findViewById(R.id.rbutton_4B);
        RadioButton r15 = findViewById(R.id.rbutton_4C);
        RadioButton r16 = findViewById(R.id.rbutton_4D);

        RadioButton r17 = findViewById(R.id.rbutton_5A);
        RadioButton r18 = findViewById(R.id.rbutton_5B);
        RadioButton r19 = findViewById(R.id.rbutton_5C);
        RadioButton r20 = findViewById(R.id.rbutton_5D);

        RadioButton r21 = findViewById(R.id.rbutton_6A);
        RadioButton r22 = findViewById(R.id.rbutton_6B);
        RadioButton r23 = findViewById(R.id.rbutton_6C);
        RadioButton r24 = findViewById(R.id.rbutton_6D);

        RadioButton r25 = findViewById(R.id.rbutton_7A);
        RadioButton r26 = findViewById(R.id.rbutton_7B);
        RadioButton r27 = findViewById(R.id.rbutton_7C);
        RadioButton r28 = findViewById(R.id.rbutton_7D);

        RadioButton r29 = findViewById(R.id.rbutton_8A);
        RadioButton r30 = findViewById(R.id.rbutton_8B);
        RadioButton r31 = findViewById(R.id.rbutton_8C);
        RadioButton r32 = findViewById(R.id.rbutton_8D);

        RadioButton r33 = findViewById(R.id.rbutton_9A);
        RadioButton r34 = findViewById(R.id.rbutton_9B);
        RadioButton r35 = findViewById(R.id.rbutton_9C);
        RadioButton r36 = findViewById(R.id.rbutton_9D);

        RadioButton r37 = findViewById(R.id.rbutton_10A);
        RadioButton r38 = findViewById(R.id.rbutton_10B);
        RadioButton r39 = findViewById(R.id.rbutton_10C);
        RadioButton r40 = findViewById(R.id.rbutton_10D);


        button.setClickable(true);

        r1.setChecked(false);
        r2.setChecked(false);
        r3.setChecked(false);
        r4.setChecked(false);
        r5.setChecked(false);
        r6.setChecked(false);
        r7.setChecked(false);
        r8.setChecked(false);
        r9.setChecked(false);
        r10.setChecked(false);
        r11.setChecked(false);
        r12.setChecked(false);
        r13.setChecked(false);
        r14.setChecked(false);
        r15.setChecked(false);
        r16.setChecked(false);
        r17.setChecked(false);
        r18.setChecked(false);
        r19.setChecked(false);
        r20.setChecked(false);
        r21.setChecked(false);
        r22.setChecked(false);
        r23.setChecked(false);
        r24.setChecked(false);
        r25.setChecked(false);
        r26.setChecked(false);
        r27.setChecked(false);
        r28.setChecked(false);
        r29.setChecked(false);
        r30.setChecked(false);
        r31.setChecked(false);
        r32.setChecked(false);
        r33.setChecked(false);
        r34.setChecked(false);
        r35.setChecked(false);
        r36.setChecked(false);
        r37.setChecked(false);
        r38.setChecked(false);
        r39.setChecked(false);
        r40.setChecked(false);

        s1.setText(null);
        s2.setText(null);
        s3.setText(null);
        s4.setText(null);
        s5.setText(null);
        s6.setText(null);
        s7.setText(null);
        s8.setText(null);
        s9.setText(null);
        s10.setText(null);

    }


}
