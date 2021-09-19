package com.company;

public class IphoneFactory implements ProductFactory {

    @Override
    public CPU buildCpu() {
        System.out.println("created new Iphone CPU");
        return new createPhoneCPU();
    }

    @Override
    public Screen buildScreen() {
        System.out.println("Created new Iphone Screen");
        return new createPhoneScreen();
    }
}
