package com.epicodus.tortunebandfanapp.models;

/**
 * Created by Guest on 10/21/15.
 */
public class Tour {
    private String mDate, mEvent, mLocation, mDetail;

    public Tour (String date, String event, String location, String detail){
        mDate = date;
        mEvent = event;
        mLocation = location;
        mDetail = detail;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getEvent() {
        return mEvent;
    }

    public void setEvent(String event) {
        mEvent = event;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }
}
