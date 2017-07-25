package com.example.amanmehta.atmetrolocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView list = (ListView) findViewById(R.id.list_item);

        final station first = new station("ATM finder","drawable://"+R.drawable.atm_hd);
        final station second = new station("Lost & found", "drawable://"+R.drawable.train_hd);
        final station third = new station("Know more","drawable://"+R.drawable.train_hd2);
        final ArrayList<station> names = new ArrayList<>();
        names.add(first);
        names.add(second);
        names.add(third);

        stationlistadapter adapter = new stationlistadapter(this,R.layout.listview,names);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(names.get(position).equals(first)){
                    Intent i = new Intent(Main2Activity.this,first_activity.class);
                    startActivity(i);
                }
                else if(names.get(position).equals(second)){
                    Intent i = new Intent(Main2Activity.this,second_activity.class);
                    startActivity(i);
                }
                else if(names.get(position).equals(third)){
                    Intent i = new Intent(Main2Activity.this,third_activity.class);
                    startActivity(i);
                }
            }

        });
    }
}
