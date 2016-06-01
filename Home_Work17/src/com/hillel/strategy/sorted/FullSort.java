package com.hillel.strategy.sorted;

import java.util.Arrays;

public class FullSort implements Strategy {
     @Override
    public void sotr(int[] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length -1; y++) {
                if (array[y] > array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
         System.out.println("Full sort: " + Arrays.toString(array));
    }
}
