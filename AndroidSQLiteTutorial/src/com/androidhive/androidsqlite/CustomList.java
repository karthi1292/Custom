package com.androidhive.androidsqlite;



import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class CustomList extends ArrayAdapter<Contact> {
	
	Context context;
	 
	
	

	public CustomList(Context context, int resourceId, List<Contact> items) {
		super(context,resourceId, items);
		this.context=context;
		
	}
	
	
	 private class ViewHolder {
       
        TextView date;
        TextView subject;
        TextView hours;
        TextView topic;
    }
	 @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
    Contact contact = getItem(position);
         
      
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_listrow, null);
            holder = new ViewHolder();
           
            holder.date = (TextView) convertView.findViewById(R.id.textView1);
            holder.subject = (TextView) convertView.findViewById(R.id.textView2);
           
            holder.topic=(TextView)convertView.findViewById(R.id.textView3);
            holder.hours = (TextView) convertView.findViewById(R.id.textView4);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
                 
        holder.date.setText(contact.getName());
        holder.subject.setText(contact.getName());
        holder.topic.setText(contact.getName());
        holder.hours.setText(contact.getName());
        
      
         
        return convertView;
    }
}


