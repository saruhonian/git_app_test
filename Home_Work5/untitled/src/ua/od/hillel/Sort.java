package ua.od.hillel;

import java.util.Scanner;

public class Sort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String operations = scanner.next();
        scanner.close();

        switch (operations) {

            case "Bob":
                System.out.println("Hello Bob!");
                break;

            case "Alice":
                System.out.println("Hello Alice!");
                break;

            case "Hello X":
                System.out.println("Hello X !");
                break;

        }


    }
}

