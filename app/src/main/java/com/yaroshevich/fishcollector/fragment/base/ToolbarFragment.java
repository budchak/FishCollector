package com.yaroshevich.fishcollector.fragment.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.fragment.base.BaseFragment;

public class ToolbarFragment extends BaseFragment {

    private Toolbar toolbar;
    private FrameLayout content;

    @Override
    public void setLogTag(String tag) {
        super.setLogTag("ToolbarFragment");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_container_with_toolbar, container, false);

        toolbar = view.findViewById(R.id.toolbar);
        content = view.findViewById(R.id.content_container);

        return view;
    }



}
