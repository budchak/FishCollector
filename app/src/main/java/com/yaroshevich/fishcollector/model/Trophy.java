package com.yaroshevich.fishcollector.model;

import java.util.ArrayList;
import java.util.List;

public class Trophy {

    private int id;

    private String name;
    private String weight;
    private String date;

    private Place places;

    private String previewImage;
    private List<String> srcList;
    private int placeId;


    public Trophy() {
        srcList = new ArrayList<>();
    }

    public Trophy(String name, String weight, String date, Place place, List<String> srcList) {
        this.name = name;
        this.weight = weight;
        this.date = date;
        this.srcList = srcList;
        this.places = place;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getWeight() {
        return weight;
    }


    public Place getPlace() {
        return places;
    }


    public void setPlace(Place place) {
        this.places = place;
    }

    public void setPlaces(Place places) {
        this.places = places;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getDate() {
        return date;
    }


    public void setSrc(List<String> src) {
        this.srcList = src;
    }


    public String getPreviewSrc() {
        return previewImage;
    }


    public void setPreviewSrc(String src) {
        this.previewImage = src;
    }



    public List<String> getSrc() {
        return srcList;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getPlaceId() {
        return placeId;
    }


    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }
}
