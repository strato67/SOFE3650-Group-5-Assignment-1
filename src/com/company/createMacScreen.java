package com.company;

public class createMacScreen implements screenMaker{
    double screenPrice;
    String screenName;

    @Override
    public boolean checkScreenWorks() {
        return true;
    }

    @Override
    public String checkColourAccuracy() {
        return "Colour accuracy is optimal";
    }

    @Override
    public void setScreenPrice(double screenPrice) {
        this.screenPrice=screenPrice;
    }

    @Override
    public void setScreenName(String screenName) {
        this.screenName=screenName;
    }

}
