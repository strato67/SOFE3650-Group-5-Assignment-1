package com.company;

public interface ProductFactory {

    CPU buildCpu();
    Screen buildScreen();
    void setCPUPrice(CPU cpu,  double price);
    void setCPUName(CPU cpu, String name);
    void setScreenPrice(Screen screen, double price);
    void setScreenName(Screen screen, String name);

}
