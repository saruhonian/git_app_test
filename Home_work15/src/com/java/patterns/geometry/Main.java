package com.java.patterns.geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        GeometricFactory geometricFactory = new GeometricFactory();
        GeometricModel geometricModel = geometricFactory.makeGeometric(in);

        geometricModel.makeGeometricModel();
    }
}
