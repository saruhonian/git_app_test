package ua.od.hillel.home_work8;


import java.util.Scanner;

public class Perevod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String str = scan.nextLine();
        scan.close();

        char array[] = str.toCharArray();
        // int array[] = {1, 0, 1, 1, 0, 1};
        int result = 0;

        for (int n = array.length - 1; n >= 0; n--) {
            int number = ((array[n]) - 48) * (int) Math.pow(2, n);
            result += number;

        }
        System.out.println("Result: " + result);


    }
}