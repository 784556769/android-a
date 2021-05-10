package com.example.game2048.View;

import com.example.game2048.R;
import com.example.game2048.Listener.TouchListener;
import com.example.game2048.util.BestScore;
import com.example.game2048.util.Util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static Context context;;

	public static int score = 0;
	public static int bestScore = 0;
	private static TextView scoreTextView, bestScoreTextView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		setContentView(R.layout.activity_main);
		
		initView();

	}

	private void initView() {
		// TODO Auto-generated method stub
		scoreTextView = (TextView) findViewById(R.id.Score);
		bestScoreTextView = (TextView) findViewById(R.id.BestScore);
		bestScoreTextView.setText(BestScore.getBestScore(context) + "");
		GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
		gridLayout.setOnTouchListener(new TouchListener());
	}

	
	public void newGame(View view) {
		Util.startGame();
	}

	
	public static void clearScore() {
		score = 0;
		showScore();
	}

	public static void showScore() {
		scoreTextView.setText(score + " ");
		if (score > BestScore.getBestScore(context)) {
			BestScore.setBestScore(context, score);
			bestScoreTextView.setText(BestScore.getBestScore(context) + "");
		}
	}

	public static void addScore(int s) {
		score += s;
		showScore();
	}

	
}
