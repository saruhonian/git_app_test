package com.java.patterns.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        ZooFactory zooFactory = new  ZooFactory();
        Zoo zoo = zooFactory.makeZooFactory(in);

        zoo.makeAnimal();
        zoo.makeAnimalTS();

    }
}
