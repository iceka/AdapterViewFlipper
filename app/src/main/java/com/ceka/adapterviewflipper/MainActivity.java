package com.ceka.adapterviewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    private String[] heroNames = {"Batman", "Superman", "Hulk", "Captain America"};
    private int[] backgroundColors = {Color.BLACK, Color.RED, Color.GREEN, Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterViewFlipper mAdapterViewFlipper = findViewById(R.id.adapter_view_flipper);

        MyAdapter mAdapter = new MyAdapter(getApplicationContext(), heroNames, backgroundColors);

        mAdapterViewFlipper.setAdapter(mAdapter);
        mAdapterViewFlipper.setFlipInterval(2000); // in milli second
        mAdapterViewFlipper.startFlipping();
    }
}
