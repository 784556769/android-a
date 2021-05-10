package com.example.game2048.View;

import com.example.game2048.Listener.MyGameListener;
import com.example.game2048.been.Card;
import com.example.game2048.util.Util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

public class GameView extends GridLayout {

	public GameView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initGameView();
	}

	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initGameView();
	}

	private void initGameView() {
		setColumnCount(4);
		Util.setGameListener(new MyGameListener());
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
		int cardWidth = (Math.min(w, h) - 10) / 4;
		addCards(cardWidth, cardWidth);
		this.measure(this.getWidth(), this.getHeight());
		Util.startGame();
	}

	public void addCards(int cardWidth, int cardHeight) {

		Card c;

		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				c = new Card(getContext());
				c.setNum(0);
				addView(c, cardWidth, cardHeight);
				Util.cardsMap[x][y] = c;
			}
		}
	}

}
