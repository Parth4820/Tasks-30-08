package com.company;

import java.util.Scanner;

public class TextSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Main String:");
        String string = scanner.nextLine();
        System.out.println("Enter the Sub-string or text you wish to search for in Main String:");
        String subString = scanner.nextLine();
        if(string.contains(subString)){
            System.out.println(subString+" is present in "+string);
        }else
            System.out.println(subString+" is not present in "+string);

    }
}
