package com.company;

public class createPhoneCPU implements CPU {

    private double cpuPrice;
    private String cpuSpd;
    private String cpuName;

    public createPhoneCPU(double cpuPrice, String cpuSpd, String cpuName) {
        this.cpuPrice = cpuPrice;
        this.cpuSpd = cpuSpd;
        this.cpuName = cpuName;
    }

    public createPhoneCPU(){
        this(75, "5Ghz","A1");
        System.out.println(toString());
    }

    @Override
    public void setCPUPrice(double cpuPrice) {
        this.cpuPrice = cpuPrice;
    }

    @Override
    public void setCPUSpd(String cpuSpd) {
        this.cpuSpd = cpuSpd;
    }

    @Override
    public void setCPUName(String cpuName) {
        this.cpuName = cpuName;
    }

    @Override
    public String toString() {
        return "createPhoneCPU{" +
                "cpuPrice=" + cpuPrice +
                ", cpuSpd='" + cpuSpd + '\'' +
                ", cpuName='" + cpuName + '\'' +
                '}';
    }
}
