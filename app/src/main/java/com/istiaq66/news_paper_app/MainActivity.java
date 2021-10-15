package com.istiaq66.news_paper_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome, msports, mscience, mhealth, mentertainment, mtech ;
    PagerAdapter pagerAdapter;
    String api="8ed5bc910e31439b8dd03cecd7bdc1a5";
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        mhome = findViewById(R.id.home);
        msports = findViewById(R.id.sports);
        mscience = findViewById(R.id.science);
        mentertainment = findViewById(R.id.entertainment);
        mhealth = findViewById(R.id.health);
        mtech = findViewById(R.id.technology);
        ViewPager viewPager = findViewById(R.id.fragment_container);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);



        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 ||tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4|| tab.getPosition()==5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }
}