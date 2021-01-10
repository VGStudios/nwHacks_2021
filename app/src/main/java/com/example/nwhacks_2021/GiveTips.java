package com.example.nwhacks_2021;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GiveTips extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        boolean outcome = getIntent().getBooleanExtra("outcome", true);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        if (outcome) {
            // Depression
            String[] array = getResources().getStringArray(R.array.tips_depression);
            String randomStr;
            list = new ArrayList<String>();
            for (int i = 0; i < 3; i++) {
                randomStr = array[new Random().nextInt(array.length)];
                list.add(randomStr);
            }
        } else {
            // Anxiety
            String[] array = getResources().getStringArray(R.array.tips_anxiety);
            String randomStr;
            list = new ArrayList<String>();
            for (int i = 0; i < 3; i++) {
                randomStr = array[new Random().nextInt(array.length)];
                list.add(randomStr);
            }
        }
        adapter = new RecyclerAdapter(list);
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(adapter);


    }

}