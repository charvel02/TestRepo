package com.example.practicefinalapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;

public class MyDog extends Activity
{
	private Context context;
	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_dog);
		context = this;
		imageView = (ImageView) findViewById(R.id.dogImageView);
	}
}
