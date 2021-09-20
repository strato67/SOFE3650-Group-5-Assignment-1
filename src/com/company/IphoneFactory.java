package com.company;

public class IphoneFactory implements ProductFactory {

    @Override
    public void setCPUPrice(CPU cpu, double price) {
        cpu.setCPUPrice(price);
    }

    @Override
    public void setCPUName(CPU cpu, String name) {
        cpu.setCPUName(name);
    }

    @Override
    public void setScreenPrice(Screen screen, double price) {
        screen.setScreenPrice(price);
    }

    @Override
    public void setScreenName(Screen screen, String name) {
        screen.setScreenName(name);
    }


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
