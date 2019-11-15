package com.yaroshevich.fishcollector.Repository;

import com.yaroshevich.trophies.model.interfaces.model.Preview;
import com.yaroshevich.trophies.model.mappers.Mapper;
import com.yaroshevich.trophies.model.mappers.TrophyEntityToPreviewMapper;
import com.yaroshevich.trophies.room.entity.Trophy;

import java.util.List;

public class PreviewRepository extends BaseRepository<Preview> {

    private List<Preview> previewList;

    @Override
    public List<Preview> getAll() {

        List<Trophy> trophyList = database.TrophyDao().getAll();
        Mapper mapper = new TrophyEntityToPreviewMapper();
        previewList = mapper.map(trophyList);
        return previewList;
    }

    public List<Preview> getAllByRiver(int id) {

        List<Trophy> trophyList = database.TrophyDao().getAll(id);
        Mapper mapper = new TrophyEntityToPreviewMapper();
        previewList = mapper.map(trophyList);
        return previewList;
    }

}
