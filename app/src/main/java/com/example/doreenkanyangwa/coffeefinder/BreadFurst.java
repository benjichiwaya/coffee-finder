package com.example.doreenkanyangwa.coffeefinder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BreadFurst extends AppCompatActivity {
    ViewPager viewPager;
    SwipeB adpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread_furst);
        viewPager = (ViewPager)findViewById(R.id.view_pager2);
        adpt = new SwipeB(this);

        viewPager.setAdapter(adpt);

    }
}