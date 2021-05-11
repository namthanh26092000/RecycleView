package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Adapter;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private DonutAdapter donutAdapter;
    private ArrayList<Donut> donuts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rcvList);
        donuts = new ArrayList<>();
        donuts.add(new Donut(R.drawable.donut_yellow_1,"Donut Vang","$10.00","It's best food"));
        donuts.add(new Donut(R.drawable.donut_red_1,"Donut Do","$10.00","It's best food"));
        donuts.add(new Donut(R.drawable.green_donut_1,"Donut xanh","$10.00","It's best food"));
        donuts.add(new Donut(R.drawable.tasty_donut_1,"Donut Tasty","$10.00","It's best food"));

        donutAdapter = new DonutAdapter(this,donuts);
        recyclerView.setAdapter(donutAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        EditText editText = findViewById(R.id.search);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
        }
    private  void filter(String text){
        ArrayList<Donut> filterDonut = new ArrayList<>();
        for(Donut donut : donuts){
            if(donut.getTen().toLowerCase().contains(text.toLowerCase())){
                filterDonut.add(donut);
            }
        }
        donutAdapter.filterList(filterDonut);
    }
}