package com.example.doreenkanyangwa.coffeefinder;

import android.content.Context;
import android.graphics.drawable.DrawableContainer;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SwipeAdptS extends PagerAdapter
{
    private int [] StarPic ={R.drawable.s_1, R.drawable.s_2,R.drawable.s_3};

    private Context ctx;
    private LayoutInflater layinflate;

    public SwipeAdptS(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        DrawableContainer v;

        layinflate = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ItemView = layinflate.inflate(R.layout.swiper,container,false);
        ImageView imgView = (ImageView) ItemView.findViewById(R.id.imageView);
        imgView.setImageResource(StarPic[position]);
        container.addView(ItemView);

        return ItemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}