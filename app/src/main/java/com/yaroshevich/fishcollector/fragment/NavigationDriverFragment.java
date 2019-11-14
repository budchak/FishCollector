package com.yaroshevich.fishcollector.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


import androidx.annotation.LayoutRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.fragment.base.BaseFragment;

public abstract class NavigationDriverFragment extends BaseFragment implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private FrameLayout content;


    @Override
    public void setLogTag(String tag) {
        super.setLogTag("NavigationDriverFragment");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_container_with_navigation_driver, container, false);
        content = view.findViewById(R.id.navigation_context);
        toolbar = view.findViewById(R.id.toolbar);

        DrawerLayout drawer = view.findViewById(R.id.drawer_layout);
        NavigationView navigationView = view.findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                getActivity(), drawer, toolbar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        return view;
    }

    public void setContentView(@LayoutRes int layoutRes){
        getLayoutInflater().inflate(layoutRes, content, true);
    }


    public void setHeader(@LayoutRes int headerId ){
        NavigationView navigationView = view.findViewById(R.id.nav_view);
        navigationView.inflateHeaderView(headerId);
    }

    public void  setNavigationMenu(@MenuRes int menuId){
        NavigationView navigationView = view.findViewById(R.id.nav_view);
        navigationView.getMenu().clear();
        navigationView.inflateMenu(menuId);
    }

    public void setFloatingActionButton(boolean visible, View.OnClickListener listener){
        FloatingActionButton button = view.findViewById(R.id.fab);
        if (visible){
            button.show();
            button.setOnClickListener(listener);
        }else {
            button.hide();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
