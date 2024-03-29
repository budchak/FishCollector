package com.yaroshevich.fishcollector.di.module;


import android.content.Context;
import com.yaroshevich.fishcollector.model.room.DB;
import com.yaroshevich.fishcollector.model.room.FishInfoDatabase;
import com.yaroshevich.fishcollector.util.ImageLoader;
import com.yaroshevich.fishcollector.util.ScreenSizeManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;


    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context getAppContext() {
        return this.context;
    }

    @Provides
    @Singleton
    FishInfoDatabase getDatabase(DB db) {
        return db.getDB();
    }

    @Provides
    @Singleton
    DB getDB(Context context) {
        return new DB(context);
    }

    @Provides
    ImageLoader getImageLoader() {
        return new ImageLoader(context);
    }

    @Provides
    ScreenSizeManager provideScreenSizeManager(Context context) {
        return new ScreenSizeManager(context);
    }

}
