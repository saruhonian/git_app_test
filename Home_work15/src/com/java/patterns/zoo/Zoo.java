package com.java.patterns.zoo;

public class Zoo {
    private String name;
    private int age;
    private String breed;
    private String color;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void makeAnimal(){
                    System.out.println();
    }

    public void makeAnimalTS() {
        System.out.print("Made model " + name + ", " + "his ege " + age + " years.");
        System.out.println(" His bread is " + breed + " and weight is " + weight + ". It is " + color + ". His color is " + color);
    }

}
