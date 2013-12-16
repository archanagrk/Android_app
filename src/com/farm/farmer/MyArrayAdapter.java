package com.farm.farmer;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyArrayAdapter extends ArrayAdapter<MySimpleAchievement> {
	private final Context context ;
	private final MySimpleAchievement[] values ;
	public MyArrayAdapter(Context context, MySimpleAchievement[] values) {
		super(context , R.layout.activity_list , values) ;
		this.context 	= context 	;
		this.values 	= values 	;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
	    
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.activity_list, parent, false);	
	    
	   
	    TextView txt 	= (TextView) 	rowView.findViewById(R.id.textView1) ;   
	    ImageView im 	= (ImageView) 	rowView.findViewById(R.id.imageView1) ;
	    
	    im.setImageResource(values[position].image) ;
	    txt.setText(values[position].name) ;

	    

	    
	    
	    return rowView ;
	}

}
