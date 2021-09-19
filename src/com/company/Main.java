package com.company;

import com.sun.security.jgss.GSSUtil;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        int factorySelection = 0;
        int productSelection = 0;

        ProductFactory productFactory;





        do{


            System.out.println("Please select your Factory");
            System.out.println("1: Iphone parts");
            System.out.println("2: Macbook parts");

            factorySelection = scan.nextInt();
            switch(factorySelection){
                case 1:
                    productFactory = new IphoneFactory();
                    break;
                case 2:
                    productFactory = new MacFactory();
                    break;
                default:
                    productFactory = null;
                    System.exit(0);
            }

            System.out.println("Please select your Factory");
            System.out.println("1: Cpu");
            System.out.println("2: Screen");

            productSelection = scan.nextInt();
            switch(productSelection){
                case 1:
                    CPU cpu = productFactory.buildCpu();
                    //cpu.setCPUPrice();
                    //cpu.setCPUName();
                    break;
                case 2:
                    Screen screen = productFactory.buildScreen();
                    //screen.SetScreenPrice();
                    //screen.SetScreenName();
                    break;
                default:
                    System.out.println("Choice must be between 1 - 4 or 0 to exit");
            }

        }while (factorySelection !=0 || productSelection!=0);


    }
}