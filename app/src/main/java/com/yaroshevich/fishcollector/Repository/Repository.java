package com.yaroshevich.fishcollector.Repository;

import java.util.List;

public interface Repository<Object> {

    void add(Object entity);
    void update(Object entity);
    void remove(Object entity);
    List<Object> getAll();


}
