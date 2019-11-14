package com.yaroshevich.fishcollector.model;

public class RecentUpdate {

   private String date;
   private String type;


    public RecentUpdate(String date, String type) {
        this.date = date;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
