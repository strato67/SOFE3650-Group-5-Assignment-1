package com.company;

public class MacFactory implements ProductFactory{
    @Override
    public void setCPUPrice(CPU cpu, double price) {
        cpu.setCPUPrice(price);
    }


    @Override
    public void setScreenPrice(Screen screen, double price) {
        screen.setScreenPrice(price);
    }
    @Override
    public CPU buildCpu() {
        System.out.println("Created new Mac CPU");
        return new createMacCPU();
    }

    @Override
    public void setScreenName(Screen screen, String name) {
        screen.setScreenName(name);
    }

    @Override
    public void setCPUName(CPU cpu, String name) {
        cpu.setCPUName(name);
    }

    @Override
    public Screen buildScreen() {
        System.out.println("Created new Mac Screen");
        return new createMacScreen();
    }
}
