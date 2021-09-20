package com.company;

import com.sun.security.jgss.GSSUtil;

import java.io.FileNotFoundException;
import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        System.out.println("If your hungry for code Factory");
        System.out.println("____________________________");
        Scanner scan = new Scanner(System.in);

        int factorySelection = 0;
        int productSelection = 0;

        ProductFactory productFactory;

        dbRead dbRead= new dbRead();

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
            if(factorySelection == 1) {
                switch (productSelection) {

                    //Apple A9 - 250
                    case 1:
                        CPU cpu = productFactory.buildCpu();
                        productFactory.setCPUPrice(cpu, Float.parseFloat(dbRead.getDatabase().get(0)[1]));
                        productFactory.setCPUName(cpu, dbRead.getDatabase().get(0)[0]);
                        System.out.println(cpu);
                        break;
                    //Iphone 5-inch
                    case 2:
                        Screen screen = productFactory.buildScreen();
                        productFactory.setScreenPrice(screen, Double.parseDouble(dbRead.getDatabase().get(1)[1]));
                        productFactory.setScreenName(screen, dbRead.getDatabase().get(1)[0]);
                        System.out.println(screen);
                        break;
                    default:
                        System.out.println("Choice must be between 1 - 4 or 0 to exit");
                }
            }else{
                switch (productSelection) {

                    //Apple 13 - 400
                    case 1:
                        CPU cpu = productFactory.buildCpu();
                        productFactory.setCPUPrice(cpu, Float.parseFloat(dbRead.getDatabase().get(2)[1]));
                        productFactory.setCPUName(cpu, dbRead.getDatabase().get(2)[0]);
                        System.out.println(cpu);

                        break;
                    //Macbook 13 inch
                    case 2:
                        Screen screen = productFactory.buildScreen();
                        productFactory.setScreenPrice(screen, Double.parseDouble(dbRead.getDatabase().get(3)[1]));
                        productFactory.setScreenName(screen, dbRead.getDatabase().get(3)[0]);
                        System.out.println(screen);
                        break;
                    default:
                        System.out.println("Choice must be between 1 - 4 or 0 to exit");
                }
            }

        }while (factorySelection !=0 || productSelection!=0);


    }
}