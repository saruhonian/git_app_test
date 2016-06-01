package com.hillel.strategy.sorted;

import java.util.Arrays;

public class SelectionSort implements Strategy {

    @Override
    public void sotr(int[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            int m_min = min;
            for (int x = min + 1; x < array.length; x++) {
                if (array[x] < array[m_min]) {
                    m_min = x;
                }
            }
            int temp = array[min];
            array[min] = array[m_min];
            array[m_min] = temp;
        }
        System.out.println("SelectionSort: " + Arrays.toString(array));
    }
}
