package com.example.shahzaib.baseadapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shahzaib on 12/4/2017.
 */

public class myCustomAdapter  extends BaseAdapter{


    private Context contextReceived;

    myCustomAdapter(Context context)
    {
        contextReceived = context;
    }

    @Override
    public int getCount() {
        return MainActivity.titles.size();
    }

    @Override
    public Object getItem(int i) {
        return MainActivity.titles.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // Context har activity k sath attach hota hy
        // agr humain isi activity k liye context chahye hota to hum sirg getLayoutInflator() call kr lyty.
        // lekin yahan pr hmain current activity k liye cotext nahi chahye
        LayoutInflater layoutInflater =  (LayoutInflater) contextReceived.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.custom_listview_layout,viewGroup,false);
        TextView title = row.findViewById(R.id.title);
        ImageView imageView = row.findViewById(R.id.titleImage);

        title.setText(MainActivity.titles.get(i));
        imageView.setImageResource(R.mipmap.ic_launcher_round);

        return row;
    }
}
