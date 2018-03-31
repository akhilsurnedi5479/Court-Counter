package com.example.akhil.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        Toast toastMessage=Toast.makeText(getApplicationContext(),"Score reset",Toast.LENGTH_SHORT);
        toastMessage.show();
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
        Toast toastMessage=Toast.makeText(getApplicationContext(),"A scored 3 points..",Toast.LENGTH_SHORT);
        toastMessage.show();
    }
    /**
     *  When Team A gets 2 Points.
     */
    public void twoPointsA(View view){
        teamAscore=teamAscore+2;
        displayForTeamA(teamAscore);
        Toast toastMessage=Toast.makeText(getApplicationContext(),"A scored 2 points..",Toast.LENGTH_SHORT);
        toastMessage.show();
    }
    /**
     *  When Team A gets freeThrow Points.
     */
    public void freeThrowA(View view){
        teamAscore=teamAscore+1;
        displayForTeamA(teamAscore);
        Toast toastMessage=Toast.makeText(getApplicationContext(),"A scored 1 point..",Toast.LENGTH_SHORT);
        toastMessage.show();
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
        Toast toastMessage=Toast.makeText(getApplicationContext(),"B scored 3 points..",Toast.LENGTH_SHORT);
        toastMessage.show();
    }
    /**
     * When Team B gets 2 points.
     */
    public void twoPointsB(View view){
        teamBscore=teamBscore+2;
        displayForTeamB(teamBscore);
        Toast toastMessage=Toast.makeText(getApplicationContext(),"B scored 2 points..",Toast.LENGTH_SHORT);
        toastMessage.show();
    }
    /**
     * When Team B get freethrows.
     */
    public void freeThrowB(View view){
        teamBscore=teamBscore+1;
        displayForTeamB(teamBscore);
        Toast toastMessage=Toast.makeText(getApplicationContext(),"B scored 1 point..",Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    /**
     * Reset the score of both the teams
     */
}
