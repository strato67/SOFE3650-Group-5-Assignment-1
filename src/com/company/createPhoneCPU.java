package com.company;

public class createPhoneCPU implements CPU {

    private double cpuPrice;

    private String cpuName;

    public createPhoneCPU(double cpuPrice, String cpuName) {
        this.cpuPrice = cpuPrice;
        this.cpuName = cpuName;
    }

    public createPhoneCPU(){
        this(75,"A1");
    }

    @Override
    public void setCPUPrice(double cpuPrice) {
        this.cpuPrice = cpuPrice;
    }

    @Override
    public void setCPUName(String cpuName) {
        this.cpuName = cpuName;
    }

    @Override
    public String toString() {
        return "cpuPrice=" + cpuPrice + ", cpuName='" + cpuName + '\''+'\n';

    }
}
