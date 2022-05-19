package com.bridgelab.BookProject.common;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner scan = new Scanner(System.in);

    public static String getString(String input){
        System.out.println("Enter the "+input+":");
        return scan.next();
    }

    public static int getInteger(String input){
        System.out.println("Enter the "+input+":");
        return scan.nextInt();
    }
}
