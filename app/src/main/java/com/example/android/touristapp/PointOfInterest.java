package com.example.android.touristapp;

/**
 * Created by charlene on 12/08/16.
 */
public class PointOfInterest {
    private String mName;
    private String mLatitude;
    private String mLongitude;
    private int mPhone;
    private String mOpen;
    private String mClose;
    private int mImageResourceId;

    public PointOfInterest(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public int getPhone() {
        return mPhone;
    }

    public String getOpen() {
        return mOpen;
    }

    public String getClose() {
        return mClose;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}



