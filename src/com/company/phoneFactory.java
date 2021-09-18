package com.company;

public class phoneFactory implements productMaker{


    @Override
    public void screenMaker() {
        createPhoneScreen phoneScreen = new createPhoneScreen();
    }

    @Override
    public void cpuMaker() {
        createPhoneCPU phoneCPU = new createPhoneCPU();
    }
}
