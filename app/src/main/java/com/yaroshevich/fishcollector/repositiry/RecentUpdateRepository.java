package com.yaroshevich.fishcollector.repositiry;

import com.yaroshevich.fishcollector.model.RecentUpdate;

import java.util.ArrayList;
import java.util.List;

public class RecentUpdateRepository {


    List<RecentUpdate> list;

    public RecentUpdateRepository() {
        list = new ArrayList<>();
        for (int i = 0; i<100; i++){
            list.add(new RecentUpdate("14.11.2019", "update"+i));
        }
    }

    public void add(Object entity) {
    }


    public void update(Object entity) {

    }


    public void remove(Object entity) {

    }


    public List<RecentUpdate> getAll() {
        return list;
    }
}
