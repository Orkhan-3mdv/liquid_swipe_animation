package com.example.luqidswipeanimation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.cuberto.liquid_swipe.LiquidPager;

public class MainActivity extends AppCompatActivity {
    LiquidPager pager;
    Adapter adapter;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        adapter = new Adapter (getSupportFragmentManager(),1);
        pager.setAdapter(adapter);
    }
}
