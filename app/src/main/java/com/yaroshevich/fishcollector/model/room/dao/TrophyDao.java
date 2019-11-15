package com.yaroshevich.fishcollector.model.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.yaroshevich.fishcollector.model.room.entity.Trophy;

import java.util.List;


@Dao
public abstract class TrophyDao {

    @Query("SELECT * FROM trophy")
    public abstract List<Trophy> getAll();

    @Query("SELECT * FROM trophy WHERE place_id = :id")
    public abstract List<Trophy> getAll(int id);

    @Query("SELECT * FROM trophy WHERE _id = :name")
    public abstract Trophy getById(int name);

    @Insert
    public abstract void insert(Trophy fishInfo);

    @Update
    public abstract void update(Trophy fishInfo);

    @Delete
    public abstract void delete(Trophy fishInfo);
}
