package com.java.patterns.geometry;

public class GeometricModel {
    private String name;
    private String color;
    private int perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public void makeGeometricModel() {
        System.out.println("Make a geometric model of a " + name + ", " + color + " color");
        System.out.println("Perimeter is " + perimeter + "cm.");
    }
}
