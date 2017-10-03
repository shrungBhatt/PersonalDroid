package com.example.android.personaldroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Shrung on 02-Aug-17.
 */

public class AlarmActivityViewPager extends FragmentStatePagerAdapter {

    private int mTabCount;

    public AlarmActivityViewPager(FragmentManager fm, int tabCount){
        super(fm);

        mTabCount = tabCount;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Alarms();
            case 1:
                return new Timers();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTabCount;
    }



}


