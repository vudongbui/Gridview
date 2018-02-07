package com.example.owner.gridviewv4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public GridView gridView ;
    public ArrayList arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        add();

    }

    private void add() {
        arrayList.add(R.drawable.lilycollins);
    }

    private void setupUI() {
        gridView.setAdapter(new GridviewAdapter(MainActivity.this, arrayList));
    }
}