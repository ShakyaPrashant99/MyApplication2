package com.examplePrashant.myapplication;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewGrid extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridviewlayout);

        GridView gridView = findViewById(R.id.gridView);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        CustomAdapter adapter = new CustomAdapter(this, dataList);
        gridView.setAdapter(adapter);
    }
}
