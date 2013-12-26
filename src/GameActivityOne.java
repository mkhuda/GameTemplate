package com.mkhuda.aplikasilistrik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GameActivityOne extends Activity implements OnClickListener {

	EditText jawaban;
	Button jawabButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game1);
		
		jawabButton = (Button) findViewById(R.id.buttonCek);
		jawabButton.setOnClickListener(onJawab);
		
	}
	
	private View.OnClickListener onJawab = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			EditText jawaban = (EditText) findViewById(R.id.editCek);
			String getNama = jawaban.getText().toString();

			if(getNama.equalsIgnoreCase("Google")) {
				Toast.makeText(GameActivityOne.this, "Anda Benar", Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(GameActivityOne.this, "Anda Salah", Toast.LENGTH_SHORT).show();
			}
			
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
		
}
