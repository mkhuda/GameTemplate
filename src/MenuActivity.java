package com.mkhuda.aplikasilistrik;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends Activity implements OnClickListener {
	
	ImageView playButton, exitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		ImageView playButton = (ImageView) findViewById(R.id.buttonPlay);
		ImageView exitButton = (ImageView) findViewById(R.id.buttonExit);
		
		playButton.setOnClickListener(this);
		exitButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.buttonPlay:
			Intent i = new Intent(MenuActivity.this, GameActivityOne.class);
	        startActivity(i);
			break;
		case R.id.buttonExit:
			finish();
			break;
		}
		
	}

}
