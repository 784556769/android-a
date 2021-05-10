package com.example.game2048.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.game2048.R;

public class IntentView extends	Activity{
	private Button bt01;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begin);
        
        bt01 = (Button)this.findViewById(R.id.bt01);
        bt01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(IntentView.this,MainActivity.class);
				startActivity(intent);
			}
		});
        
        
	}
}
