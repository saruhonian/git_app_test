package ua.od.hillel.home_work8;


public class Temp {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8, 12};
        boolean result = search(array, 1, 0, array.length - 1);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("There is no search an element");
        }
    }
    public static boolean search(int[] array, int value, int min, int max) {
        int mid = (min + max) / 2;

        if (array[mid] == value) return true;

        if (min >= max) return false;

        if (array[mid] > value) {
            boolean result = search(array, value, min, mid - 1);
            return result;
        } else {
            boolean result = search(array, value, mid + 1, max);
            return result;


        }
    }
}
