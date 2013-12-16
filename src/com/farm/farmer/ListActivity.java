package com.farm.farmer;

import java.util.ArrayList;
import java.util.HashMap;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ListActivity extends Activity {

	private ArrayList<MySimpleAchievement> allAchievements;
	private RelativeLayout mainLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.allAchievements= new ArrayList<MySimpleAchievement>();
		
		allAchievements.add( new MySimpleAchievement("Rice" , R.drawable.rice , "http://en.wikipedia.org/wiki/Rice")) ;
		allAchievements.add( new MySimpleAchievement("Wheat" , R.drawable.wheat , "http://en.wikipedia.org/wiki/Wheat" )) ;
		allAchievements.add( new MySimpleAchievement("Chinese Potato" , R.drawable.rotundifolius_chin , "http://en.wikipedia.org/wiki/Plectranthus_rotundifolius")) ;
		allAchievements.add( new MySimpleAchievement("Ladies Finger" , R.drawable.ladies_finger ,"http://en.wikipedia.org/wiki/Okra")) ;
		allAchievements.add( new MySimpleAchievement("Amaranth" , R.drawable.amaranthus , "http://en.wikipedia.org/wiki/Amaranthus")) ;
		allAchievements.add( new MySimpleAchievement("Drumstick" , R.drawable.drum , "http://en.wikipedia.org/wiki/Drumstick_%28vegetable%29")) ;
		allAchievements.add( new MySimpleAchievement("Garlic" , R.drawable.garlic , "http://en.wikipedia.org/wiki/Garlic" )) ;
		allAchievements.add( new MySimpleAchievement("Potato" , R.drawable.potato , "http://en.wikipedia.org/wiki/Potato")) ;
		allAchievements.add( new MySimpleAchievement("Radish" , R.drawable.raddish ,"http://en.wikipedia.org/wiki/Radish")) ;
		allAchievements.add( new MySimpleAchievement("Tomato" , R.drawable.tomato , "http://en.wikipedia.org/wiki/Tomato")) ;
		allAchievements.add( new MySimpleAchievement("Curry Leaf" , R.drawable.curry , "http://en.wikipedia.org/wiki/Curry_leaf")) ;
		allAchievements.add( new MySimpleAchievement("Water Leaf" , R.drawable.water , "http://en.wikipedia.org/wiki/Indra" )) ;
		allAchievements.add( new MySimpleAchievement("Indian Spinach" , R.drawable.indian_spinach , "http://en.wikipedia.org/wiki/Indian_spinach")) ;
		allAchievements.add( new MySimpleAchievement("Chilli" , R.drawable.chilli ,"http://en.wikipedia.org/wiki/Chilli")) ;
		allAchievements.add( new MySimpleAchievement("Banana" , R.drawable.banana , "http://en.wikipedia.org/wiki/Banana")) ;
		allAchievements.add( new MySimpleAchievement("Beet Root" , R.drawable.bee_root , "http://en.wikipedia.org/wiki/Beet_root")) ;
		allAchievements.add( new MySimpleAchievement("Carrot" , R.drawable.carrot , "http://en.wikipedia.org/wiki/Carrot")) ;
		allAchievements.add( new MySimpleAchievement("Cabbage" , R.drawable.cabbage , "http://en.wikipedia.org/wiki/Cabbage")) ;
		allAchievements.add( new MySimpleAchievement("Cauliflower" , R.drawable.cauli , "http://en.wikipedia.org/wiki/Cauliflower")) ;
		allAchievements.add( new MySimpleAchievement("Brinjal" , R.drawable.brinjal , "http://en.wikipedia.org/wiki/Brinjal")) ;




		
		ListView listView= new ListView(ListActivity.this) ;
		listView.setLayoutParams(new ListView.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT)) ;
		listView.setPadding(10, 10, 10, 10 ) ;
		listView.setBackgroundColor(0x77000000) ;
		
		ArrayList<MySimpleAchievement> a = this.allAchievements ;
		final MySimpleAchievement[] values = new MySimpleAchievement[a.size()] ;
		for(int i = 0 , j = a.size() ; i < j ; i++)
		{
			values[i] = a.get(i) ;
		}
		
		listView.setAdapter(new MyArrayAdapter(ListActivity.this, (MySimpleAchievement[]) values)) ;
		listView.setClickable(true) ;
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View view, int position ,long arg3) {
			    
			    Uri uri = Uri.parse(values[position].link);
			    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			    startActivity(intent);
				
			}
		});
        mainLayout = new RelativeLayout(this);
        mainLayout.setBackgroundResource(R.drawable.corn);
		mainLayout.addView(listView, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT,RelativeLayout.LayoutParams.FILL_PARENT)) ;
		setContentView(mainLayout);

	}


}
