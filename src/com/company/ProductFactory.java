package com.company;

public interface ProductFactory {

    public CPU buildCpu();
    public Screen buildScreen();
    void setCPUPrice(CPU cpu,  double price);
    void setScreenPrice(Screen screen, double price);
    void setScreenName(Screen screen, String name);
    void setCPUName(CPU cpu, String name);
}
