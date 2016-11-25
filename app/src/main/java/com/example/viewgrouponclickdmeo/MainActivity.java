package com.example.viewgrouponclickdmeo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {
	protected static final String tag = "MainActivity";
	private MyLayout layout;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		layout = (MyLayout) findViewById(R.id.layout);
		button = (Button) findViewById(R.id.button);
		
		
		layout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i(tag, "click   layout ...........................");
			}
		});
		
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i(tag, "click   button ...........................");
			}
		});
	}
	
	// ViewGroupÉÏµÄdispatchTouchEvent(ev)
}
