package com.example.amanmehta.atmetrolocator;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.SearchManager;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;

import static com.example.amanmehta.atmetrolocator.R.id.search;

public class first_activity extends AppCompatActivity {

    EditText search;
    ListView list2;
    ArrayAdapter adapter;
    Button btn;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);

        list2 = (ListView) findViewById(R.id.list2);
        final ArrayList<String> names = new ArrayList<>();
        String Badarpur = "Badarpur";
        String Badarpur2 = "Badarpur2";
        String Badarpur3 = "Badarpur3";
        String Badarpur4 = "Badarpur4";
        String Badarpur5 = "Badarpur5";
        String Badarpur6 = "Badarpur6";
        String Badarpur7 = "Badarpur7";
        String Badarpur8 = "Badarpur8";
        String Badarpur9 = "Badarpur8";
        String Badarpur10 = "Badarpur8";
        String Badarpur11 = "Badarpur9";
        String Badarpur12 = "Badarpur9";
        String Badarpur13 = "Badarpur5";
        String Badarpur14 = "Badarpur43";
        String Badarpur15 = "Badarpur14";
        String Badarpur16 = "Badarpur56";
        String Badarpur17 = "Badarpur5";
        String Badarpur18 = "Badarpur5";
        String Badarpur19 = "Badarpur5";
        String Badarpur20 = "Badarpur5";
        String Badarpur21 = "Badarpur5";
        String Badarpur22 = "Badarpur5";
        String Badarpur23 = "Badarpur5";
        String Badarpur24 = "Badarpur2";

        names.add(Badarpur4);
        names.add(Badarpur5);
        names.add(Badarpur6);
        names.add(Badarpur7);
        names.add(Badarpur8);
        names.add(Badarpur9);
        names.add(Badarpur10);
        names.add(Badarpur11);
        names.add(Badarpur12);
        names.add(Badarpur13);
        names.add(Badarpur14);
        names.add(Badarpur15);names.add(Badarpur23);
        names.add(Badarpur16);
        names.add(Badarpur17);
        names.add(Badarpur18);
        names.add(Badarpur19);
        names.add(Badarpur20);names.add(Badarpur24);
        names.add(Badarpur21);




        String Mohan_estate = "Mohan estate";
        String Sarita_vihar = "Sarita vihar";
        String Jasola = "Jasola";
        String Okhla = "Okhla";
        String Kalka_ji = "Kalka ji";
        String Nehru_place = "Nehru place";
        //String Badarpur2 = "Badarpur";
        String Mohan_estate2 = "Mohan estate";
        String Sarita_vihar2 = "Sarita vihar";
        String Jasola2 = "Jasola";
        String Okhla2 = "Okhla";
        String Kalka_ji2 = "Kalka ji";
        String Nehru_place2 = "Nehru place";
       // String Badarpur3 = "Badarpur";
        String Mohan_estate3 = "Mohan estate";
        String Sarita_vihar3 = "Sarita vihar";
        String Jasola3 = "Jasola";
        String Okhla3 = "Okhla";
        String Kalka_ji3 = "Kalka ji";
        String Nehru_place3 = "Nehru place";

        names.add(Badarpur);
        names.add(Badarpur);
        names.add(Badarpur);
        names.add(Badarpur);
        names.add(Badarpur);
        names.add(Badarpur);
        names.add(Badarpur);names.add(Badarpur);



        names.add(Mohan_estate);
        names.add(Sarita_vihar);
        names.add(Jasola);
        names.add(Okhla);
        names.add(Kalka_ji);
        names.add(Nehru_place);

        names.add(Badarpur2);
        names.add(Mohan_estate2);
        names.add(Sarita_vihar2);
        names.add(Jasola2);
        names.add(Okhla2);
        names.add(Kalka_ji2);
        names.add(Nehru_place2);

        names.add(Badarpur3);
        names.add(Mohan_estate3);
        names.add(Sarita_vihar3);
        names.add(Jasola3);
        names.add(Okhla3);
        names.add(Kalka_ji3);
        names.add(Nehru_place3);

        adapter = new ArrayAdapter(this,R.layout.hidden_listview,R.id.text3,names);
        list2.setAdapter(adapter);



        search = (EditText) findViewById(R.id.search);
//
//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                search.setText("");
//                list2.setVisibility(View.VISIBLE);
////                new SearchView.OnQueryTextListener() {
////                    @Override
////                    public boolean onQueryTextSubmit(String query) {
////                        return false;
////                    }
////
////                    @Override
////                    public boolean onQueryTextChange(String newText) {
////                        // yaha pe type hote hi it should expand into list view
////
////                        return true;
////                    }
////
////                };
//
//            }
//        });

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                InputMethodManager imm = (InputMethodManager) getSystemService(context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(search, InputMethodManager.SHOW_IMPLICIT);
                if(s.length() == 0){
                    list2.setVisibility(View.INVISIBLE);
                }else{
                    list2.setVisibility(View.VISIBLE);
                }
                (first_activity.this).adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                search.setText(adapter.getItem(position).toString());
                list2.setVisibility(view.INVISIBLE);
            }
        });

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i =new Intent(first_activity.this, searchresult.class);
                i.putExtra("Station_name", search.getText().toString());
                startActivity(i);
            }
        });

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
