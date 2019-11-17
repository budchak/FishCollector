package com.yaroshevich.fishcollector.ui.waterInfo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WaterTabAdapter extends FragmentPagerAdapter {


    public WaterTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    // Returns the fragment_place_description to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:


            case 1:



            case 2:



            default:
                return null;
        }
    }

    // Will be displayed as the tab's label
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Описание";

            case 1:
                return "Запреты";

            case 2:
                return "Рыбы";

            default:
                return null;
        }
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return 3;
    }


}
