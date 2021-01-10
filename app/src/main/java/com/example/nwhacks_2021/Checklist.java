package com.example.nwhacks_2021;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Checklist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        String[] array = getResources().getStringArray(R.array.checklist);

        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        c1.setText(array[new Random().nextInt(array.length)]);

        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        c2.setText(array[new Random().nextInt(array.length)]);

        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        c3.setText(array[new Random().nextInt(array.length)]);

        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        c4.setText(array[new Random().nextInt(array.length)]);

    }
}
