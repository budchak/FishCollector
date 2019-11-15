package com.yaroshevich.fishcollector.di.component;

import com.yaroshevich.fishcollector.di.module.MainActivityModule;
import com.yaroshevich.fishcollector.di.spore.ActivitySpore;
import com.yaroshevich.fishcollector.ui.MainActivity;

import dagger.Subcomponent;

@ActivitySpore
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
