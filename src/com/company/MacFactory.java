package com.company;

public class MacFactory implements ProductFactory{

    @Override
    public CPU buildCpu() {
        System.out.println("Created new Mac CPU");
        return new createMacCPU();
    }

    @Override
    public Screen buildScreen() {
        System.out.println("Created new Mac Screen");
        return new createMacScreen();
    }
}
