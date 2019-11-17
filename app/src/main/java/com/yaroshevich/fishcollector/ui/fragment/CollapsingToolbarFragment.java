package com.yaroshevich.fishcollector.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.LayoutRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.ui.fragment.base.BaseFragment;

public class CollapsingToolbarFragment extends BaseFragment {

    private Toolbar toolbar;
    public FrameLayout content;
    private CollapsingToolbarLayout collapsingToolbarLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_container_with_collapsing_toolbar, container, false);
        collapsingToolbarLayout = view.findViewById(R.id.fish_info_collapsing_toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);
        toolbar = view.findViewById(R.id.toolbar);
        content = view.findViewById(R.id.content_container);
        return view;
    }

    public void setContentView(@LayoutRes int layoutRes) {
        getLayoutInflater().inflate(layoutRes, content, true);
    }

    public void setContentView(View view) {
        content.removeAllViews();
        content.addView(view);
    }

    public ToolbarBuilder getToolbarBuilder(){
        return new ToolbarBuilder();
    }



    public class ToolbarBuilder{


        public ToolbarBuilder() {
        }

        public ToolbarBuilder setMenu(@MenuRes int menuId){
            toolbar.inflateMenu(menuId);
            return this;
        }

        public ToolbarBuilder setTitle(String title){
            toolbar.setTitle(title);
            return this;
        }

        public ToolbarBuilder setBackButtonEnable(boolean isEnable){
            toolbar.setNavigationIcon(R.drawable.ic_keyboard_arrow_left_white_24dp); // your drawable
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });

            return this;
        }

    }
}
