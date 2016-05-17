package com.java.git.test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sing function: ");
        String operations = scanner.next();
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        scanner.close();


        switch (operations) {
            case "*":
                System.out.println("Result: " + (a * b));
                break;

            case "/":
                System.out.println("Result: " + (a / b));
                break;

            case "+":
                System.out.println("Result: " + (a + b));
                break;

            case "-":
                System.out.println("Result: " + (a - b));
                break;

        }

    }



}
