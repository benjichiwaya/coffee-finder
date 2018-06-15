package com.example.doreenkanyangwa.coffeefinder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen3 extends AppCompatActivity {
    ViewPager viewPager;
    SwipeAdptS adpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        viewPager = (ViewPager)findViewById(R.id.view_pager1);
        adpt = new SwipeAdptS(this);

        viewPager.setAdapter(adpt);

    }
}
