package com.yaroshevich.fishcollector.model.room;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.yaroshevich.fishcollector.model.room.dao.TrophyDao;
import com.yaroshevich.fishcollector.model.room.entity.Trophy;


@Database(entities = { Trophy.class}, version = 1, exportSchema = false)
public abstract class FishInfoDatabase extends RoomDatabase {

    public abstract TrophyDao TrophyDao();
}