package com.example.excusegenerator;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Busy extends Activity
{
	private Context context;
	private RadioGroup radioButtons;
	private RadioButton washingHair;
	private RadioButton dishes;
	private RadioButton laundry;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busy);
		context = this;
		
		MyListener listener = new MyListener();
		
		radioButtons = (RadioGroup) findViewById(R.id.busyList);
		radioButtons.clearCheck();
		
		washingHair = (RadioButton) findViewById(R.id.washingHair);
		washingHair.setOnClickListener(listener);
		
		dishes = (RadioButton) findViewById(R.id.dishes);
		dishes.setOnClickListener(listener);
		
		laundry = (RadioButton) findViewById(R.id.laundry);
		laundry.setOnClickListener(listener);
		
			
		
	}

	public class MyListener implements View.OnClickListener {
		@Override
		public void onClick(View arg0) {
			if(arg0.getId() == R.id.washingHair) 
			{
					
				Toast.makeText(context, "I can't make it, I am " +washingHair.getText() +".", Toast.LENGTH_LONG)
				.show();
			}
			else if(arg0.getId() == R.id.dishes) 
			{
					
				Toast.makeText(context, "I can't make it, I am " +dishes.getText() +".", Toast.LENGTH_LONG)
				.show();
			}
			else
			{
				Toast.makeText(context, "I can't make it, I am " +laundry.getText() +".", Toast.LENGTH_LONG)
				.show();
			}
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.busy, menu);
		return true;
	}

}
