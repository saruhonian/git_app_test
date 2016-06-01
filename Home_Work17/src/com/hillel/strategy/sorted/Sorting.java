package com.hillel.strategy.sorted;

public class Sorting {
    private Strategy strategy;

    public Sorting(Strategy strategy) {

        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sotr(array);
    }


}
