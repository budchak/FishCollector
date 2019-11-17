package com.yaroshevich.fishcollector.ui.RecentEvent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.adapter.RecentActionsAdapter;
import com.yaroshevich.fishcollector.ui.fragment.NavigationDriverFragment;
import com.yaroshevich.fishcollector.ui.listener.RecyclerViewClickListener;
import com.yaroshevich.fishcollector.model.RecentUpdate;
import com.yaroshevich.fishcollector.navigation.AppNavigator;
import com.yaroshevich.fishcollector.model.repositiry.RecentUpdateRepository;

import java.util.List;

public class RecentEventFragment extends NavigationDriverFragment {

    private RecyclerView recyclerView;
    private AppNavigator navigator;

    public RecentEventFragment() {

    }

    @Override
    public void setLogTag(String tag) {
        super.setLogTag("RecentEventFragment");
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setContentView(R.layout.fragment_recycler_view);
        navigator = AppNavigator.getInstance(null);
        List<RecentUpdate> list = new RecentUpdateRepository().getAll();
        RecentActionsAdapter actionsAdapter = new RecentActionsAdapter(null);
        actionsAdapter.setClickListener(new RecyclerViewClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getContext(), "create", Toast.LENGTH_SHORT).show();
            }
        });

        setHeader(R.layout.navigation_header);
        setNavigationMenu(R.menu.menu_driver);
        setFloatingActionButton(true, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "fab", Toast.LENGTH_SHORT).show();
                navigator.navigateToDetailScreen(0);
            }
        });
        AppNavigator.getInstance(null);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(actionsAdapter);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_gallery: navigator.navigateWaterTabScreen();
        }
        return false;
    }
}
