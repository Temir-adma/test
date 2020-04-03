package com.example.anarbek.test;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity<tabLayout> extends AppCompatActivity {
    private ViewPager pager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);
        MainPagesAdapter adapt= new MainPagesAdapter(getSupportFragmentManager());
        pager.setAdapter(adapt);


        tabLayout.setupWithViewPager(pager);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
