package com.company;

public class createMacScreen implements Screen{

    private double screenPrice;
    private String screenName;

    public createMacScreen(double screenPrice, String screenName) {
        this.screenPrice = screenPrice;
        this.screenName = screenName;
    }

    public createMacScreen() {
        this(1000, "13inch");
    }

    @Override
    public void setScreenPrice(double screenPrice) {
        this.screenPrice = screenPrice;

    }

    @Override
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return "screenPrice = " + screenPrice + ", screenName = '" + screenName + '\''+"\n";
    }
}
