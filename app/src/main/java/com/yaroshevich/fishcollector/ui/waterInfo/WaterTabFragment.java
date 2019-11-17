package com.yaroshevich.fishcollector.ui.waterInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.ui.fragment.CollapsingToolbarFragment;

public class WaterTabFragment extends CollapsingToolbarFragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setContentView(R.layout.fragment_water_info);
        viewPager = view.findViewById(R.id.view_pager);
        //viewPager.setAdapter(new WaterTabAdapter(getActivity().getSupportFragmentManager(),1));
        tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }




}
