package com.hillel.strategy.sorted;

import java.util.Arrays;

public class InsertionSort implements Strategy {
    @Override
    public void sotr(int[] array) {
        for (int x = 1; x < array.length; x++) {
            int temp = array[x];
            int j = x;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        System.out.println("SelectionSort: " + Arrays.toString(array));

    }
}
