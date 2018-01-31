package com.example.shahzaib.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> titles;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titles = new ArrayList<>(10);
        listView = findViewById(R.id.listView);

        // Storing data in arrayList
        for(int i=0; i<10; i++)
        {
            titles.add("Title "+i);
        }


        myCustomAdapter adapter = new myCustomAdapter(this);
        listView.setAdapter(adapter);






    }
}
