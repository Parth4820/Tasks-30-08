package com.company;

import java.util.Scanner;

public class FindDuplicateCharacters {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Main String.");
        String string = scanner.nextLine();
        char[] charactersOfString = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            for (int j = i+1; j < string.length(); j++){
                if (charactersOfString[i] == charactersOfString[j]){
                    System.out.println("Duplicate characters are: "+charactersOfString[i]+"\t");
                }
            }
        }
        System.out.println("No Duplicate characters.");
    }
}
