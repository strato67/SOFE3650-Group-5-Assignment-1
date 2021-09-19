package com.company;

public class createPhoneScreen implements Screen{

    private double screenPrice;
    private String screenName;

    public createPhoneScreen(double screenPrice, String screenName) {
        this.screenPrice = screenPrice;
        this.screenName = screenName;
    }

    public createPhoneScreen() {
        this(500, "4 inch screen");
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
        return "createPhoneScreen{" +
                "screenPrice=" + screenPrice +
                ", screenName='" + screenName + '\'' +
                '}';
    }
}
