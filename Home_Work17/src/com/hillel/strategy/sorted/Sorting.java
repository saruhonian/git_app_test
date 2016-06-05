package com.hillel.strategy.sorted;

public class Sorting {
    private Strategy strategy;

    public Sorting(Strategy strategy) {

        this.strategy = strategy;
    }

    public String sort(int[] array) {
        String sortSt = "";
        strategy.sotr(array);
        String tmp;
        for (int i = 0; i < array.length; i++) {
            tmp = String.valueOf(array[i]);
            sortSt += tmp;
        }
        return sortSt;
    }

}
