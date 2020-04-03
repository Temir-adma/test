package com.example.anarbek.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import static com.example.anarbek.test.ItemListFragment.TYPE_EVENT;
import static com.example.anarbek.test.ItemListFragment.TYPE_INFO;
import static com.example.anarbek.test.ItemListFragment.TYPE_KEY;

public class MainPagesAdapter extends FragmentPagerAdapter {

    public MainPagesAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0)
        {
            Fragment fragment= new ItemListFragment();
            Bundle bundle=new Bundle();
            bundle.putInt(TYPE_KEY,TYPE_EVENT);

            fragment.setArguments(bundle);
            return  fragment;
        }
        else if(position==1) {
            Fragment fragment= new ItemListFragment();
            Bundle bundle=new Bundle();
            bundle.putInt(TYPE_KEY,TYPE_INFO);

            fragment.setArguments(bundle);
            return  fragment;
        }
        return null;
        /*Fragment  fragment = new ItemListFragment();
        return fragment;*/
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0)
        {
            return "Мероприятия";
        }
        else if(position==1) {
            return "Объект";
        }

           return null;

        }


}
