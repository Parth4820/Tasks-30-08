package com.company;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String userInput = scanner.nextLine();
        StringBuilder reverseString = new StringBuilder(userInput);
        reverseString.reverse();
        System.out.println("Reversed String is:"+reverseString);
        if(userInput.equalsIgnoreCase(String.valueOf(reverseString))){
            System.out.println("Given string is a palindrome.");
        }
        else
        System.out.println("Given string is not a palindrome.");
    }
}
