package com.example.tirednesschecker;
import android.app.Activity;
import android.os.Bundle;


public class ContinueScreenActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.tirednesschecker.MESSAGE";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.choose);


	}
	

}
