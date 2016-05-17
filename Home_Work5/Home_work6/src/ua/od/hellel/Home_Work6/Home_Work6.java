package ua.od.hellel.Home_Work6;


import java.util.Scanner;

public class Home_Work6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number for ADD(+): ");
        System.out.print("Enter number 'n':");

        int n = scanner.nextInt();

        System.out.print("Enter number 'm':");
        int m = scanner.nextInt();

        int result = 0;

        result = n + m;

        System.out.println("Result: " + result);
    }
}
