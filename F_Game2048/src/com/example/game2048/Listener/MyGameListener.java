package com.example.game2048.Listener;

import com.example.game2048.View.MainActivity;
import com.example.game2048.util.Util;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class MyGameListener implements GameListener {



	

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		MainActivity.clearScore();

		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				Util.cardsMap[x][y].setNum(0);
			}
		}
		Util.addRandomNum();
		Util.addRandomNum();
	}

	@Override
	public void lostGame() {
		// TODO Auto-generated method stubsc


		
		new AlertDialog.Builder(MainActivity.context).setTitle("哎！结束了").setMessage("游戏结束，您的本局的分数是分"+ MainActivity.score+"，继续加油哦！")
				.setPositiveButton("重新开始", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						startGame();
					}
				}).show();
	}

}
