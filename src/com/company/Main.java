package com.company;

import com.sun.security.jgss.GSSUtil;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        int menu = 0;

        ProductFactory factory1;
        ProductFactory factory2;

        do{
            System.out.println("What part would you like to make:");
            System.out.println("1: Iphone CPU");
            System.out.println("2: Macbook CPU");
            System.out.println("3: Iphone Screen");
            System.out.println("4: Macbook Screen\n");
            System.out.println("0: to exit\n");
            //take input
            menu = scan.nextInt();


            switch(menu){
                case 1:
                    IphoneFactory Iphone = new IphoneFactory();
                    Iphone.buildCpu();
                    break;
                case 2:
                    MacFactory macFact = new MacFactory();
                    macFact.buildCpu();
                    break;
                case 3:
                    IphoneFactory Iphone2 = new IphoneFactory();
                    Iphone2.buildScreen();
                    break;
                case 4:
                    CPU cpu = new CPU();
                    MacFactory macFact2 = new MacFactory();
                    macFact2.buildScreen();
                    break;
                default:
                    System.out.println("Choice must be between 1 - 4 or 0 to exit");
            }

        }while (menu !=0);


    }
}