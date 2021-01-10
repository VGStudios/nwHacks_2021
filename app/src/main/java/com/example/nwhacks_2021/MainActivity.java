package com.example.nwhacks_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        final String[] spinner1 = new String[1];

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.symptoms));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                parentView.getItemAtPosition(position);
                spinner1[0] = mySpinner.getSelectedItem().toString();
                TextView view = (TextView) findViewById(R.id.textView);
                view.setText(spinner1[0]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        final String[] spinner2 = new String[1];

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.symptoms));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter);
        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                parentView.getItemAtPosition(position);
                spinner2[0] = mySpinner2.getSelectedItem().toString();
                TextView view2 = (TextView) findViewById(R.id.textView2);
                view2.setText(spinner2[0]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);
        final String[] spinner3 = new String[1];

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.symptoms));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner3.setAdapter(myAdapter);
        mySpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                parentView.getItemAtPosition(position);
                spinner3[0] = mySpinner3.getSelectedItem().toString();
                TextView view3 = (TextView) findViewById(R.id.textView3);
                view3.setText(spinner3[0]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }
}