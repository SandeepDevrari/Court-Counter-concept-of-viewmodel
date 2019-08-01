package devrari.sandeep.court_counter.viewmodel;

import androidx.lifecycle.ViewModel;

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
}
