package com.rnfsoft.simplearrayadapterlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by taehee on 8/21/15.
 */
public class UsersAdapter extends ArrayAdapter<User> {

    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context,0, users); // Generate a constructor and edit '0' and ArrayList<User>
    }

    //Override Method

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        User user = getItem(position);

        /*if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }*/
        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            viewHolder.name = (TextView)convertView.findViewById(R.id.tvName);
            viewHolder.home = (TextView)convertView.findViewById(R.id.tvHome);
            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder)convertView.getTag();
        }


        TextView tvName = (TextView)convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView)convertView.findViewById(R.id.tvHome);

        tvName.setText(user.name);
        tvHome.setText(user.hometown);

        return convertView; // replace converView with default super.getView(position, convertView, parent)




    }

    private static class ViewHolder{
        TextView name;
        TextView home;
    }
}
