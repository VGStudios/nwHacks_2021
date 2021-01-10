package com.example.nwhacks_2021;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Checklist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        TextView header1 = (TextView) findViewById(R.id.textView4);
        header1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));
        String[] array = getResources().getStringArray(R.array.checklist);
        String item;
        List<String> itemList = new ArrayList<String>();

        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c1.setText(item);
        c1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c2.setText(item);
        c2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c3.setText(item);
        c3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        item = array[new Random().nextInt(array.length)];
        while (itemList.contains(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c4.setText(item);
        c4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

    }
}
