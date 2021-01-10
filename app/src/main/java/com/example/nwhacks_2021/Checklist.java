package com.example.nwhacks_2021;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Checklist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        String[] array = getResources().getStringArray(R.array.checklist);
        String item;
        List<String> itemList = new ArrayList<String>();

        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c1.setText(item);

        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c2.setText(item);

        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c3.setText(item);

        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c4.setText(item);

    }
}
