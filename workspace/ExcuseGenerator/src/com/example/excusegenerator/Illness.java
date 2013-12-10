package com.example.excusegenerator;

import java.util.ArrayList;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Illness extends Activity
{
	private Button illnessGenerateButton;
	private ArrayList<String> illnessList;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_illness);
		context = this;

		illnessList = new ArrayList<String>(4);
		generateIllnessList();

		MyListener listener = new MyListener();

		illnessGenerateButton = (Button) findViewById(R.id.illnessGenerateButton);
		illnessGenerateButton.setOnClickListener(listener);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.illness, menu);
		return true;
	}

	public void generateIllnessList()
	{
		illnessList.add("Influenza");
		illnessList.add("the measles");
		illnessList.add("the mumps");
		illnessList.add("Chicken Pox");
	}

	public class MyListener implements View.OnClickListener {
		@Override
		public void onClick(View arg0) {
			if(arg0.getId() == R.id.illnessGenerateButton) 
			{
				Random r = new Random();
				int value = r.nextInt(4);
				
				
				Toast.makeText(context, "I can't make it, I have " +illnessList.get(value) +".", Toast.LENGTH_LONG)
				.show();
			}
		}
	}
}
