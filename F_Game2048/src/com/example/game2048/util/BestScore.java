package com.example.game2048.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class BestScore {
	public static SharedPreferences sharedPreferences;

	public static int getBestScore(Context context) {
		sharedPreferences =context.getSharedPreferences("BestScore", Context.MODE_PRIVATE);
		int topScore = sharedPreferences.getInt("BestScore", 0);
		return topScore;
	}

	public static void setBestScore(Context context,int bestScore) {
		sharedPreferences =context.getSharedPreferences("BestScore", Context.MODE_PRIVATE);
		Editor editor = sharedPreferences.edit();
		editor.putInt("BestScore", bestScore);
		editor.commit();
	}
}
