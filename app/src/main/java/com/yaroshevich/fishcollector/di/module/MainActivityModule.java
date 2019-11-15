package com.yaroshevich.fishcollector.di.module;


import androidx.appcompat.app.ActionBar;

import com.yaroshevich.fishcollector.di.spore.ActivitySpore;
import com.yaroshevich.fishcollector.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainActivity provideMainActivity() {
        return mainActivity;
    }


    @ActivitySpore
    @Provides
    ActionBar provideActionBar() {
        return mainActivity.getSupportActionBar();
    }
}
