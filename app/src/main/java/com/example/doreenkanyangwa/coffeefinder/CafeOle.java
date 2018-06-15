package com.example.doreenkanyangwa.coffeefinder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CafeOle extends AppCompatActivity {
   ViewPager viewPager;
    SwipeAdpt adpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_ole);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adpt = new SwipeAdpt(this);

        viewPager.setAdapter(adpt);

    }
}
