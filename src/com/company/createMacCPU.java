package com.company;

public class createMacCPU implements cpuMaker{
    double cpuPrice;
    double cpuSpd;
    String cpuName;

    @Override
    public void setCPUPrice(double cpuPrice) {
        this.cpuPrice = cpuPrice;
    }

    @Override
    public void setCPUclkSpd(double cpuSpd) {
        this.cpuSpd=cpuSpd;
    }

    @Override
    public void setCPUName(String cpuName) {
        this.cpuName=cpuName;
        System.out.println("Cpu:"+ this.cpuName);
    }
}
