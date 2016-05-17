package ua.od.hillel.Home_Work5;

/* 1. Сделайте сортировку выборкой, когда нужно найти минимальный элемент и посчитайте сколько на нее отводится операций(времени)
попробуйте увеличить количество элементов в массиве и оценить на сколько увеличится время */

public class Exercise_1 {
    public static void main(String[] args) {
        int[] array = {96, 52, 63, 12, 35, 57, 95, 2, 9, 4};
        int[] sortedArray = sort(array);
        Print.printArray(sortedArray);


    }


    public static int[] sort(int[] array) {
        int operations = 0;

        long start = System.nanoTime();

        for (int n = 0; n < array.length; n++) {
            for (int p = n + 1; p < array.length; p++) {
                if (array[n] > array[p]) {
                    int cache = array[p];
                    array[p] = array[n];
                    array[n] = cache;
                }
                operations++;
            }


        }

        long end = System.nanoTime();
        long durations = end - start;
        System.out.println("Time: " + durations);

       System.out.println("Sort operations: " + operations);
        return array;

    }


}
