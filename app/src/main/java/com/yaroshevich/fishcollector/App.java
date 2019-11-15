package com.yaroshevich.fishcollector;

import android.app.Application;

import com.yaroshevich.fishcollector.di.component.AppComponent;
import com.yaroshevich.fishcollector.di.component.DaggerAppComponent;
import com.yaroshevich.fishcollector.di.component.MainActivityComponent;
import com.yaroshevich.fishcollector.di.component.NewTrophyScreenComponent;
import com.yaroshevich.fishcollector.di.module.AppModule;
import com.yaroshevich.fishcollector.di.module.MainActivityModule;
import com.yaroshevich.fishcollector.di.module.NewTrophyScreenModule;
import com.yaroshevich.fishcollector.ui.MainActivity;
import com.yaroshevich.fishcollector.ui.newTrophy.NewTrophyFragment;


public class App extends Application {

    private static App app;
    private static AppComponent component;
    private static NewTrophyScreenComponent newTrophyScreenComponent;
    private static MainActivityComponent mainActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();

    }

    public static App getInstance() {
        return app;
    }
    public NewTrophyScreenComponent initNewTrophyComponent(NewTrophyFragment fragment) {
        if (newTrophyScreenComponent == null) {
            newTrophyScreenComponent = component.plusNewTrophyComponent(new NewTrophyScreenModule(fragment));
        }
        return newTrophyScreenComponent;
    }


    public MainActivityComponent initMainActivityComponent(MainActivity activity){
        if (mainActivityComponent == null){
            mainActivityComponent = component.plusMainActivityComponent(new MainActivityModule(activity));
        }
        return mainActivityComponent;
    }

    public static AppComponent getComponent() {
        return component;
    }


    public NewTrophyScreenComponent getListComponent() {
        return newTrophyScreenComponent;
    }





    public void destroyListComponent() {
        newTrophyScreenComponent = null;
    }

}
