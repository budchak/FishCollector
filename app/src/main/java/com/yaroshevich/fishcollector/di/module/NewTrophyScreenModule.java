package com.yaroshevich.fishcollector.di.module;



import com.yaroshevich.fishcollector.di.spore.FragmentSpore;
import com.yaroshevich.fishcollector.ui.newTrophy.NewTrophyFragment;


import dagger.Module;
import dagger.Provides;

@Module
public class NewTrophyScreenModule {

    private NewTrophyFragment fragment;

    public NewTrophyScreenModule(NewTrophyFragment fragment) {
        this.fragment = fragment;
    }


    @Provides
    NewTrophyFragment provideFragment() {
        return fragment;
    }




}
