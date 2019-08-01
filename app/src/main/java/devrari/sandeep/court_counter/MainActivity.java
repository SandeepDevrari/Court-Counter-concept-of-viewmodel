package devrari.sandeep.court_counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import devrari.sandeep.court_counter.databinding.ActivityMainBinding;
import devrari.sandeep.court_counter.viewmodel.ViewModelMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private TextView teamAScore,teamBScore;
    private ViewModelMainActivity viewModelMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelMainActivity= ViewModelProviders.of(this).get(ViewModelMainActivity.class);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewmodel(viewModelMainActivity);
//        setContentView(R.layout.activity_main);
//        setUpUI();
    }

//    private void setUpUI() {
//        viewModelMainActivity= ViewModelProviders.of(this).get(ViewModelMainActivity.class);
//        teamAScore=findViewById(R.id.tv_score);
//        teamBScore=findViewById(R.id.tv_score_b);
//        setData(1,viewModelMainActivity.getScoreATeam());
//        setData(2,viewModelMainActivity.getScoreBTeam());
//
//        findViewById(R.id.b_2_point).setOnClickListener(this);
//        findViewById(R.id.b_3_point).setOnClickListener(this);
//        findViewById(R.id.b_free_throw).setOnClickListener(this);
//        findViewById(R.id.b_2_point_b).setOnClickListener(this);
//        findViewById(R.id.b_3_point_b).setOnClickListener(this);
//        findViewById(R.id.b_free_throw_b).setOnClickListener(this);
//        findViewById(R.id.b_reset).setOnClickListener(this);
//    }
//
//    private void setData(int team, int score) {
//        if(team==0){
//            teamAScore.setText(score+"");
//            teamBScore.setText(score+"");
//        }else if(team==1){
//            teamAScore.setText(score+"");
//        }else if(team==2){
//            teamBScore.setText(score+"");
//        }
//    }

    @Override
    public void onClick(View view) {
//        int team=-1,score=0;
//        switch (view.getId()){
//            case R.id.b_2_point:{
//                team=1;
//                score=2+viewModelMainActivity.getScoreATeam();
//                viewModelMainActivity.setScoreATeam(score);
//                break;
//            }
//            case R.id.b_3_point:{
//                team=1;
//                score=3+viewModelMainActivity.getScoreATeam();
//                viewModelMainActivity.setScoreATeam(score);
//                break;
//            }
//            case R.id.b_2_point_b:{
//                team=2;
//                score=2+viewModelMainActivity.getScoreBTeam();
//                viewModelMainActivity.setScoreBTeam(score);
//                break;
//            }
//            case R.id.b_3_point_b:{
//                team=2;
//                score=3+viewModelMainActivity.getScoreBTeam();
//                viewModelMainActivity.setScoreBTeam(score);
//                break;
//            }
//            case R.id.b_free_throw:{
//                team=1;
//                score=5+viewModelMainActivity.getScoreATeam();
//                viewModelMainActivity.setScoreATeam(score);
//                break;
//            }
//            case R.id.b_free_throw_b:{
//                team=2;
//                score=6+viewModelMainActivity.getScoreBTeam();
//                viewModelMainActivity.setScoreBTeam(score);
//                break;
//            }
//            case R.id.b_reset:{
//                team=0;
//                score=0;
//                viewModelMainActivity.setScoreATeam(0);
//                viewModelMainActivity.setScoreBTeam(0);
//                break;
//            }
//        }
//        setData(team,score);
    }
}
