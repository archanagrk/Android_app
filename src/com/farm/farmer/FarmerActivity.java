package com.farm.farmer;

import com.farmer.doneby.DoneBy;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class FarmerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farmer);
		
		
		final Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				  
				Intent intent =  new Intent(FarmerActivity.this , ListActivity.class);
			    startActivity(intent);
			}
		}) ;
		
		
		
		final Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				  
				Intent intent =  new Intent(FarmerActivity.this , DoneBy.class);
			    startActivity(intent);
			}
		}) ;

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_farmer, menu);
		return true;
	}



}
