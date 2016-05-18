package com.java.patterns.zoo;

public class Wolf extends Zoo {
    Wolf(String name, int age, String breed, String color, int weight) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setColor(color);
        setWeight(weight);
    }

    public void makeAnimal(){
        System.out.println("─┌┐\uF04B");

    }
}
