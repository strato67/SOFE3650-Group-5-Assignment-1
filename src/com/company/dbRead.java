package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class dbRead {

    ArrayList<String[]> database  = new ArrayList<>(); // Create an ArrayList object

    public dbRead() throws FileNotFoundException {

        String line = "";
        String splitBy = ",";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("Database.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                //System.out.println("Product name = " + employee[0] + ", Price= " + employee[1]);
                database.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> getDatabase() {
        return database;
    }

    @Override
    public String toString() {
        return "dbRead{" +
                "database=" + database +
                '}';
    }
}


