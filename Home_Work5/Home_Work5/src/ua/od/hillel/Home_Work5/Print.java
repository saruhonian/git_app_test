package ua.od.hillel.Home_Work5;


public class Print {
    public static void printArray(int[] array) {
        System.out.println("Sort Array: ");
        for (int n = 0; n < array.length; n++) {
            if (n != 0)
                System.out.print(", ");
            System.out.print(array[n]);
        }

    }
}
