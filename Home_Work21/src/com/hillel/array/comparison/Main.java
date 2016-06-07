package com.hillel.array.comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 9};
        int[] array2 = {3, 9, 12};
        int[] array3 = new int[array1.length];
        int n = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {
                    array3[n] = array2[j];
                    n++;
                }

            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
