package com.example.practicefinalapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
	private Button quoteButton;
	private Button dogButton;
	private Button ggcButton;
	private Context context;
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;		
		MyOnClickListener listener = new MyOnClickListener();
		
		quoteButton = (Button) findViewById(R.id.quoteButton);			
		quoteButton.setOnClickListener(listener);
		
		dogButton = (Button) findViewById(R.id.dogButton);
		dogButton.setOnClickListener(listener);
		
		ggcButton = (Button) findViewById(R.id.ggcButton);
		ggcButton.setOnClickListener(listener);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public class MyOnClickListener implements View.OnClickListener {
		@Override
		public void onClick(View arg0) {
			if(arg0.getId() == R.id.quoteButton) {
				Toast.makeText(context, "May the Schwartz be with you!", Toast.LENGTH_LONG)
				.show();
			}
			
			if(arg0.getId() == (R.id.dogButton))
			{
				Intent intent = new Intent(getApplicationContext(), MyDog.class);
				startActivity(intent);
			}
			if(arg0.getId() == (R.id.ggcButton))
			{
				Intent intent = new Intent(getApplicationContext(), WebActivity.class);
				startActivity(intent);

			}
			}
		}
}
