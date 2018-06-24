package com.example.s.scorekeeper1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int scorePatna;
    int scoreTamil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeToPatna(View v){
        scorePatna=scorePatna+3;
        displayForPatna(scorePatna);
    }
    public void addTwoToPatna(View v){
        scorePatna=scorePatna+2;
        displayForPatna(scorePatna);
    }
    public void addOneToPatna(View v){
        scorePatna=scorePatna+1;
        displayForPatna(scorePatna);
    }
    public void addBonusToPatna(View v){
        scorePatna=scorePatna+1;
        displayForPatna(scorePatna);
    }
    public void addMinusToPatna(View v){
        scorePatna=scorePatna-1;
        displayForPatna(scorePatna);
    }
    public void addThreeToTamil(View v){
        scoreTamil=scoreTamil+3;
        displayForTamil(scoreTamil);
    }
    public void addTwoToTamil(View v){
        scoreTamil=scoreTamil+2;
        displayForTamil(scoreTamil);
    }
    public void addOneToTamil(View v){
        scoreTamil=scoreTamil+1;
        displayForTamil(scoreTamil);
    }
    public void addBonusToTamil(View v){
        scoreTamil=scoreTamil+1;
        displayForTamil(scoreTamil);
    }
    public void addMinusToTamil(View v){
        scoreTamil=scoreTamil-1;
        displayForTamil(scoreTamil);
    }
    public void resetScore(View v){
        scoreTamil=0;
        scorePatna=0;
        displayForPatna(scorePatna);
        displayForTamil(scoreTamil);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForPatna(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patna_text_view);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTamil(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tamil_text_view);
        scoreView.setText(String.valueOf(score));
    }


}
