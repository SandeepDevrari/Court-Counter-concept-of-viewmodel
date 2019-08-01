package devrari.sandeep.court_counter.viewmodel;

import android.view.View;

import androidx.lifecycle.ViewModel;

import devrari.sandeep.court_counter.R;

public class ViewModelMainActivity extends ViewModel {
    private int scoreATeam=0;
    private int scoreBTeam=0;

    public int getScoreATeam() {
        return scoreATeam;
    }

    public void setScoreATeam(int scoreATeam) {
        this.scoreATeam = scoreATeam;
    }

    public int getScoreBTeam() {
        return scoreBTeam;
    }

    public void setScoreBTeam(int scoreBTeam) {
        this.scoreBTeam = scoreBTeam;
    }

    public void onButtonClick(View view){
        //int team=-1,score=0;
        switch (view.getId()){
            case R.id.b_2_point:{
                scoreATeam+=2;
                break;
            }
            case R.id.b_3_point:{
                scoreATeam+=3;
                break;
            }
            case R.id.b_2_point_b:{
                scoreBTeam+=2;
                break;
            }
            case R.id.b_3_point_b:{
                scoreBTeam+=3;
                break;
            }
            case R.id.b_free_throw:{
                scoreATeam+=5;
                break;
            }
            case R.id.b_free_throw_b:{
                scoreBTeam+=6;
                break;
            }
            case R.id.b_reset:{
                scoreBTeam=0;
                scoreATeam=0;
                break;
            }
        }
    }
}
