package com.bytefly.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityLifecycle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_lifecycle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_lifecycle, menu);
		return true;
	}

}
