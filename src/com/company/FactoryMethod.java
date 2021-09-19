package com.company;

public class FactoryMethod {

    private CPU cpu;
    private Screen screen;

    public FactoryMethod(ProductFactory factory){
        cpu = factory.buildCpu();
        screen = factory.buildScreen();

    }

    public CPU getCpu() {
        System.out.println("test");
        return cpu;
    }

    public Screen getScreen() {
        System.out.println("test");
        return screen;
    }
}
