package com.company;

public class createMacCPU implements CPU{

    private double cpuPrice;
    private String cpuSpd;
    private String cpuName;

    public createMacCPU(double cpuPrice, String cpuSpd,String cpuName){
        this.cpuName = cpuName;
        this.cpuPrice = cpuPrice;
        this.cpuSpd = cpuSpd;
    }

    public createMacCPU(){
        this(100,"10 ghz","A2");
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
        return "createMacCPU{" +
                "cpuPrice=" + cpuPrice +
                ", cpuSpd=" + cpuSpd +
                ", cpuName='" + cpuName + '\'' +
                '}';
    }
}
