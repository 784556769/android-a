package com.example.game2048.Listener;

import com.example.game2048.util.Util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class TouchListener implements OnTouchListener {
	private float startX, startY, offsetX, offsetY;

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			startX = event.getX();
			startY = event.getY();
			break;
		case MotionEvent.ACTION_UP:
			offsetX = event.getX() - startX;
			offsetY = event.getY() - startY;
			if (Math.abs(offsetX) > Math.abs(offsetY)) {
				if (offsetX < -5) {
					Util.swipeLeft();
				} else if (offsetX > 5) {
					Util.swipeRight();
				}
			} else {
				if (offsetY < -5) {
					Util.swipeUp();
				} else if (offsetY > 5) {
					Util.swipeDown();
				}

			}
			break;
		}
		return true;
	}

}
