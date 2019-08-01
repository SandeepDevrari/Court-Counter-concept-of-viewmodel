package devrari.sandeep.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView teamAScore,teamBScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpUI();
    }

    private void setUpUI() {
        teamAScore=findViewById(R.id.tv_score);
        teamBScore=findViewById(R.id.tv_score_b);
        teamBScore.setText("0");
        teamAScore.setText("0");
        findViewById(R.id.b_2_point).setOnClickListener(this);
        findViewById(R.id.b_3_point).setOnClickListener(this);
        findViewById(R.id.b_free_throw).setOnClickListener(this);
        findViewById(R.id.b_2_point_b).setOnClickListener(this);
        findViewById(R.id.b_3_point_b).setOnClickListener(this);
        findViewById(R.id.b_free_throw_b).setOnClickListener(this);
        findViewById(R.id.b_reset).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int team=-1,score=0;
        switch (view.getId()){
            case R.id.b_2_point:{
                team=1;
                score=2;
                break;
            }
            case R.id.b_3_point:{
                team=1;
                score=3;
                break;
            }
            case R.id.b_2_point_b:{
                team=2;
                score=2;
                break;
            }
            case R.id.b_3_point_b:{
                team=2;
                score=3;
                break;
            }
            case R.id.b_free_throw:{
                team=1;
                score=5;
                break;
            }
            case R.id.b_free_throw_b:{
                team=2;
                score=6;
                break;
            }
            case R.id.b_reset:{
                team=0;
                score=0;
                break;
            }
        }
        if(team==0){
            teamAScore.setText(score+"");
            teamBScore.setText(score+"");
        }else if(team==1){
            int s= Integer.parseInt((teamAScore.getText().toString()));
            teamAScore.setText(score+s+"");
        }else if(team==2){
            int s= Integer.parseInt((teamBScore.getText().toString()));
            teamBScore.setText(score+s+"");
        }
    }
}
