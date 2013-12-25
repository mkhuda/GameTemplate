package com.mkhuda.aplikasilistrik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
	
	private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_splash);
	    
	    new Handler().postDelayed(new Runnable() {
	    	 
	        /*
	         * Menampilkan timer untuk splash screen
	         */
	 
	            @Override
	            public void run() {
	            // Mengeksekusi Activity setelah Splash
	                Intent i = new Intent(SplashActivity.this, MenuActivity.class);
	                startActivity(i);
	 
	            // Menutup activity splash
	            finish();
	        }
	    }, SPLASH_TIME_OUT);
    }

}
