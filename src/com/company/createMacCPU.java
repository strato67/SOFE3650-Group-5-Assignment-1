package com.company;

public class createMacCPU implements CPU{

    private double cpuPrice;
    private String cpuName;

    public createMacCPU(double cpuPrice,String cpuName){
        this.cpuName = cpuName;
        this.cpuPrice = cpuPrice;

    }

    public createMacCPU(){
        this(100,"A2");
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
