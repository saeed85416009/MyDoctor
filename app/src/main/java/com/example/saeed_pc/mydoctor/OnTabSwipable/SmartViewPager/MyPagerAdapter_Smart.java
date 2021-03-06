package com.example.saeed_pc.mydoctor.OnTabSwipable.SmartViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.saeed_pc.mydoctor.OnTabSwipable.ViewPager.FirstFragment;
import com.example.saeed_pc.mydoctor.OnTabSwipable.ViewPager.SecondFragment;


// Extend from SmartFragmentStatePagerAdapter now instead for more dynamic ViewPager items
public  class MyPagerAdapter_Smart extends SmartFragmentStatePagerAdapter {
    private SmartFragmentStatePagerAdapter adapterViewPager;
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter_Smart(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }


    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return FirstFragment.newInstance(0, "Page # 1");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return FirstFragment.newInstance(1, "Page # 2");
            case 2: // Fragment # 1 - This will show SecondFragment
                return SecondFragment.newInstance(2, "Page # 3");
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Hi Dr";
            case 1:
                return "Book";
            case 2:
                return "Dr resume";
        }
        return "Page " + position;
    }



}
