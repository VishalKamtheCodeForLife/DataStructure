package com.example.department;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVData{
    private static final String CSV_FILE_PATH
            = "C:\\Users\\Vishal_Kamthe\\Documents\\Data.csv";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(CSV_FILE_PATH));
        sc.useDelimiter(",");
        while (sc.hasNext()){
            System.out.print(sc.next());
        }
        sc.close();
    }
}