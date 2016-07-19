package com.example.android.bigappleroll;

/**
 * Created by Daniel on 7/18/2016.
 */
public class Location {

    private String mLocationName;
    private String mLocationStreetAddress;
    private String mPhoneNumber;
    private int mImgResourceId = HAS_NO_IMAGE;
    private static final int HAS_NO_IMAGE = -1;

    public Location(String mLocationName, String mLocationStreetAddress, String mPhoneNumber) {
        this.mLocationName = mLocationName;
        this.mLocationStreetAddress = mLocationStreetAddress;
        this.mPhoneNumber = mPhoneNumber;
    }

    public Location(String mLocationName, String mLocationStreetAddress, String mPhoneNumber, int mImgResourceId) {
        this.mLocationName = mLocationName;
        this.mLocationStreetAddress = mLocationStreetAddress;
        this.mPhoneNumber = mPhoneNumber;
        this.mImgResourceId = mImgResourceId;
    }

    public int getmImgResourceId() {
        return mImgResourceId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmLocationStreetAddress() {
        return mLocationStreetAddress;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public boolean hasImage(){return mImgResourceId != HAS_NO_IMAGE;}
}
