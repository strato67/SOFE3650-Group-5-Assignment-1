package com.company;

public interface ProductFactory {

    public CPU buildCpu();
    public Screen buildScreen();
    void setCPUPrice(CPU cpu,  float price);
    void setScreenPrice(Screen screen, float price);
    void setScreenName(Screen screen, String name);
    void setCPUName(CPU cpu, String name);
}
