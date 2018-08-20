package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    LinearLayout sliderdotspanel;
   private int dotscount;
   private ImageView[] dots;
    View view;
    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.home_fragment,container,false);

       Button about_btn,next,previous;
        about_btn=view.findViewById(R.id.read_btn);
        next=view.findViewById(R.id.next);
        previous=view.findViewById(R.id.previous);
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),AboutUsActivity.class));
            }
        });
       viewPager=view.findViewById(R.id.home_viewpager);
       sliderdotspanel=(LinearLayout)view.findViewById(R.id.sliderdots);

       final HomeviewPagerAdapter homeviewPagerAdapter=new HomeviewPagerAdapter(getActivity());
       viewPager.setAdapter(homeviewPagerAdapter);

       dotscount=homeviewPagerAdapter.getCount();
       dots=new ImageView[dotscount];
       for (int i=0;i<dotscount;i++){
           dots[i]=new ImageView(getActivity());
           dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.nonactive_dots));
           LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
           params.setMargins(8,0,8,0);
           sliderdotspanel.addView(dots[i],params);
       }
       dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.active_dots));
       viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }

           @Override
           public void onPageSelected(int position) {
               for (int i=0;i<dotscount;i++){
                   dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.nonactive_dots));
               }
               dots[position].setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.active_dots));
           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
       previous.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               viewPager.setCurrentItem(viewPager.getCurrentItem()-1,true);
           }
       });
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               viewPager.setCurrentItem(viewPager.getCurrentItem()+1,true);
           }
       });

        return view;
    }


}
