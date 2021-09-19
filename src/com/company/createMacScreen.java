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
        System.out.println("default constructor");
    }


    @Override
    public void SetScreenPrice(double screenPrice) {
        this.screenPrice = screenPrice;

    }

    @Override
    public void SetScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return "createMacScreen{" +
                "screenPrice=" + screenPrice +
                ", screenName='" + screenName + '\'' +
                '}';
    }
}
