package com.example.excusegenerator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
	private Button illnessButton;
	private Button busyButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MyListener listener = new MyListener();
		
		
		illnessButton = (Button) findViewById(R.id.illnessButton);
		illnessButton.setOnClickListener(listener);
		
		busyButton = (Button) findViewById(R.id.busyButton);
		busyButton.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class MyListener implements View.OnClickListener {
		@Override
		public void onClick(View arg0) {
			if(arg0.getId() == R.id.illnessButton) 
			{
				Intent intent = new Intent(getApplicationContext(), Illness.class);
				startActivity(intent);
			}
			
			if(arg0.getId() == (R.id.busyButton))
			{
				Intent intent = new Intent(getApplicationContext(), Busy.class);
				startActivity(intent);
			}
		}
}

}
