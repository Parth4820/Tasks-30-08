package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Press 1 for Addition.");
            System.out.println(" Press 2 for Subtraction.");
            System.out.println(" Press 3 for Multiplication.");
            System.out.println(" Press 4 for Division.");
            System.out.println(" Press 5 for Exit.");
            choice = scanner.nextInt();
            switch (choice){
                case 1 : System.out.println("The answer is :"+addition()+"\n\n\n");
                            break;
                case 2 : System.out.println("The answer is :"+subtraction()+"\n\n\n");
                            break;
                case 3 : System.out.println("The answer is :"+multiplication()+"\n\n\n");
                            break;
                case 4 : System.out.println("The answer is :"+division()+"\n\n\n");
                            break;
                case 5 : System.exit(1);
            }
        }while(choice != 5 );
    }
    public static int addition(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms you wish to add.");
        int noOfTerms = scanner.nextInt();
        for (int i = 0; i < noOfTerms; i++ ){
            System.out.println("Enter the "+(i+1)+" term you wish to add.");
            result += scanner.nextInt();
        }
        return result;
    }
    public static int multiplication(){
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms you wish to multiply.");
        int noOfTerms = scanner.nextInt();
        for (int i = 0; i < noOfTerms; i++ ){
            System.out.println("Enter the "+(i+1)+" term you wish to multiply.");
            result *= scanner.nextInt();
        }
        return result;
    }
    public static int subtraction(){
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the terms in order you wish their subtraction.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        result = num1 - num2;
        return  result;
    }
    public static int division(){
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the terms in order you wish their division.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        result = num1 / num2;
        return  result;
    }
}
