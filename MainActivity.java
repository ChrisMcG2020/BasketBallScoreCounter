package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare constant variable for types of score
    final int THREEPOINT = 3;
    final int TWOPOINT = 2;
    final int FREETHROW = 1;

    //other variables required
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //adds three points
    public void addThreeForTeamA(View v) {
        scoreTeamA=scoreTeamA+THREEPOINT;
        displayForTeamA(scoreTeamA);

    }

    //add two points
    public void addTwoForTeamA(View v) {
        scoreTeamA=scoreTeamA+TWOPOINT;
        displayForTeamA(scoreTeamA);
    }

    //add one point
    public void addOneForTeamA(View v) {
        scoreTeamA=scoreTeamA+FREETHROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Team B Side
    //adds three points
    public void addThreeForTeamB(View v) {
        scoreTeamB=scoreTeamB+THREEPOINT;
        displayForTeamB(scoreTeamB);

    }

    //add two points
    public void addTwoForTeamB(View v) {
        scoreTeamB=scoreTeamB+TWOPOINT;
        displayForTeamB(scoreTeamB);
    }

    //add one point
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + FREETHROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore (View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
