package com.example.akhil.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore=0;
    int teamBscore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Reset the score of both A and B.
     */
    public void resetScore(View view){
        teamAscore=0;
        teamBscore=0;
        displayForTeamA(teamAscore);
        displayForTeamB(teamBscore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     *  When Team A gets 3 Points.
     */
    public void threePointsA(View view){
        teamAscore=teamAscore+3;
        displayForTeamA(teamAscore);
    }
    /**
     *  When Team A gets 2 Points.
     */
    public void twoPointsA(View view){
        teamAscore=teamAscore+2;
        displayForTeamA(teamAscore);
    }
    /**
     *  When Team A gets freeThrow Points.
     */
    public void freeThrowA(View view){
        teamAscore=teamAscore+1;
        displayForTeamA(teamAscore);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * When Team B gets 3 Points.
     */
    public void threePointsB(View view){
        teamBscore=teamBscore+3;
        displayForTeamB(teamBscore);
    }
    /**
     * When Team B gets 2 points.
     */
    public void twoPointsB(View view){
        teamBscore=teamBscore+2;
        displayForTeamB(teamBscore);
    }
    /**
     * When Team B get freethrows.
     */
    public void freeThrowB(View view){
        teamBscore=teamBscore+1;
        displayForTeamB(teamBscore);
    }

    /**
     * Reset the score of both the teams
     */
}
