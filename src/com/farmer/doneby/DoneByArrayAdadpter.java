package com.farmer.doneby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.farm.farmer.R;

public class DoneByArrayAdadpter extends ArrayAdapter<MyDoneBys> {

	private final Context context ;
	private final MyDoneBys[] values ;
	
	public DoneByArrayAdadpter(Context context, MyDoneBys[] v) {
		super(context, R.layout.activity_done_by , v);
		this.context = context ;
		this.values = v ;

	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
	    
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.activity_done_by, parent, false);	
	    
	   
	    TextView txt 	= (TextView) 	rowView.findViewById(R.id.textView1) ;   
	    ImageView im 	= (ImageView) 	rowView.findViewById(R.id.imageView1) ;
	    
	    im.setImageResource(values[position].image) ;
	    txt.setText(values[position].data) ;

	    

	    
	    
	    return rowView ;
	}

}
