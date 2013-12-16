package com.farmer.doneby;

import java.util.ArrayList;

import com.farm.farmer.ListActivity;
import com.farm.farmer.MyArrayAdapter;
import com.farm.farmer.MySimpleAchievement;
import com.farm.farmer.R;
import com.farm.farmer.R.layout;
import com.farm.farmer.R.menu;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout.LayoutParams;

public class DoneBy extends Activity {

	private ArrayList<MyDoneBys> doneBys;
	private RelativeLayout mainLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		this.doneBys= new ArrayList<MyDoneBys>();
		
		doneBys.add(new MyDoneBys(R.drawable.potato , "Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man,Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man")) ;
		doneBys.add(new MyDoneBys(R.drawable.banana , "Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man,Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man")) ;
		doneBys.add(new MyDoneBys(R.drawable.brinjal , "Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man,Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man")) ;
		doneBys.add(new MyDoneBys(R.drawable.carrot , "Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man,Marshall's package of proto-Siva features, including that of three heads. She interprets what John Marshall interpreted as facial as not human but more bovine, possibly a divine buffalo-man")) ;





		
		ListView listView= new ListView(DoneBy.this) ;
		listView.setLayoutParams(new ListView.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT)) ;
		listView.setPadding(10, 10, 10, 10 ) ;
		listView.setBackgroundColor(0x77000000) ;
		
		final MyDoneBys[] values = new MyDoneBys[doneBys.size()] ;
		for(int i = 0 , j = doneBys.size() ; i < j ; i++)
		{
			values[i] = doneBys.get(i) ;
		}
		
		listView.setAdapter(new DoneByArrayAdadpter(DoneBy.this, (MyDoneBys[]) values)) ;
        mainLayout = new RelativeLayout(this);
        mainLayout.setBackgroundResource(R.drawable.corn);
		mainLayout.addView(listView, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT,RelativeLayout.LayoutParams.FILL_PARENT)) ;
		setContentView(mainLayout);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish() ;
	}

}
