package ua.od.hillel.home_work8;


public class Temp17 {
    public static void main(String[] args) {
        int[] array = {17, 13, 10, 7, 5, 2};
        boolean result = search(array, 2, 0, array.length - 1);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("There is no search an element");
        }
    }
    public static boolean search(int[] array, int value, int start, int end) {
        int mid = (start + end) / 2;

        if (array[mid] == value) return true;

        if (start >= end) return false;

        if (array[mid] < value) {
            boolean result = search(array, value, start, mid - 1);
            return result;
        } else {
            boolean result = search(array, value, mid + 1, end);
            return result;


        }
    }
}
