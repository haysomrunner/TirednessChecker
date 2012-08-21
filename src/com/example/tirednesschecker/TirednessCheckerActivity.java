package com.example.tirednesschecker;

import com.example.tirednesschecker.ContinueScreenActivity;
import com.example.tirednesschecker.R;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

public class TirednessCheckerActivity extends Activity {
    
//	public final static String EXTRA_MESSAGE = "com.example.tirednesschecker.MESSAGE";
	
	/** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);
    }
    
    public void continuescreen(View v) {

//        Resources res = getResources();
//        String purple = getString(R.string.purple);
        
        Intent intent = new Intent(this, ContinueScreenActivity.class);
//        String message = "You clicked "+purple;
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        
        
  }
    
    
    
}