package com.example.amanmehta.atmetrolocator;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button button;
    private static final String TAG = "MainActivity";
    ImageView image;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: yoo");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   ListView list = (ListView) findViewById(R.id.list);
        image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.transport);
        image.setBackgroundColor(Color.rgb(135, 206, 250));

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                Log.i("clicks","You Clicked B1");
                Intent i=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);//here you can start your Activity B.
            }

        }, 1000);
//        ArrayList<String> names = new ArrayList<>();
//        names.add("yoo");
//        names.add("hi");
//        names.add("bak");


      //  ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names); given by OS
//        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.listview,R.id.textView2,names); //customized
//        ArrayAdapter adapter2 = new ArrayAdapter(this,R.layout.listview,R.id.textView4,names);
//        ArrayAdapter adapter3 = new ArrayAdapter(this,R.layout.listview,R.id.textView3,names);
//        list.setAdapter(adapter);
//        list.setAdapter(adapter2);
//        list.setAdapter(adapter3);
//
//        station rajiv_chowk = new station("Rajiv Chowk", "blue", "drawable://"+R.drawable.metro);
//        station cs = new station("central secretariat", "yellow", "drawable://"+R.drawable.metro2);
//        station kashmiri_gate = new station("kashmiri gate", "red", "drawable://"+R.drawable.metro3);
//        station badarpur = new station("badarpur", "violet", "drawable://"+R.drawable.metro4);
//        station inderlok = new station("inderlok", "green", "drawable://"+R.drawable.metro5);
//        station rajiv_chowk2 = new station("Rajiv Chowk", "blue", "drawable://"+R.drawable.metro6);
//        station rajiv_chowk3 = new station("Rajiv Chowk", "blue","drawable://"+R.drawable.metro3);
//        station rajiv_chowk4 = new station("Rajiv Chowk", "blue","drawable://"+R.drawable.metro2);
//        ArrayList<station> stationsList = new ArrayList<>();
//
//        stationsList.add(rajiv_chowk);
//        stationsList.add(cs);
//        stationsList.add(kashmiri_gate);
//        stationsList.add(badarpur);
//        stationsList.add(inderlok);
//        stationsList.add(rajiv_chowk2);
//        stationsList.add(rajiv_chowk3);
//        stationsList.add(rajiv_chowk4);
//
//        stationsList.add(rajiv_chowk);
//        stationsList.add(cs);
//        stationsList.add(kashmiri_gate);
//        stationsList.add(badarpur);
//        stationsList.add(inderlok);
//        stationsList.add(rajiv_chowk2);
//        stationsList.add(rajiv_chowk3);
//        stationsList.add(rajiv_chowk4);
//
//        stationsList.add(rajiv_chowk);
//        stationsList.add(cs);
//        stationsList.add(kashmiri_gate);
//        stationsList.add(badarpur);
//        stationsList.add(inderlok);
//        stationsList.add(rajiv_chowk2);
//        stationsList.add(rajiv_chowk3);
//        stationsList.add(rajiv_chowk4);

      //  stationlistadapter adapter = new stationlistadapter(this,R.layout.listview,stationsList);

       // list.setAdapter(adapter);


    }
}
