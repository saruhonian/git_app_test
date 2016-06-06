package com.hillel.strategy.sorted;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 8, 1, 3, 2, 4, 9};
        //MainForm mainForm = new MainForm(array);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm();
            }
        });
       // Sorting sorting = new Sorting(new InsertionSort());
        // sorting.sort(array);
    }
}
