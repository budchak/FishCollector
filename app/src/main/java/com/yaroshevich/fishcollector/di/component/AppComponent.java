package com.yaroshevich.fishcollector.di.component;


import android.content.Context;

import com.yaroshevich.fishcollector.di.module.AppModule;
import com.yaroshevich.fishcollector.di.module.MainActivityModule;
import com.yaroshevich.fishcollector.di.module.NewTrophyScreenModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    Context getContext();

    NewTrophyScreenComponent plusNewTrophyComponent(NewTrophyScreenModule listModule);

    MainActivityComponent plusMainActivityComponent(MainActivityModule mainActivity);


}
