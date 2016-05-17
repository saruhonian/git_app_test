package com.java.patterns.geometry;

public class GeometricFactory {
    public GeometricModel makeGeometric(String type) {
        GeometricModel geometricModel;

        switch (type) {
            case "square":
                geometricModel = new Square("Square", "red", 35);
                break;
            case "rhombus":
                geometricModel = new Rhombus("Rhombus", "blue", 47);
                break;
            case "circle":
                geometricModel = new Circle("Circle", "white", 21);
                break;
            case "rectangle":
                geometricModel = new Rectangle("Rectangle", "black", 58);
                break;
            default:
                geometricModel = null;
        }
        return geometricModel;
    }
}
