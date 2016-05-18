package com.java.patterns.zoo;

public class ZooFactory {
    public Zoo zooFactory(String typeAnimal) {
        Zoo zoo;
        switch (typeAnimal){
            case "cat":
                zoo = new Cat("Murzik", 1, "Scottish Fold", "violet", 4);
                break;
            case "parrot":
                zoo = new Parrot("KeshaStupid", 3, "Pernatiy", "varicolored", 1);
                break;
            case "dog":
                zoo = new Dog("Mukhtar", 2, "shepherd-dog", "blak", 35);
                break;
            case "wolf":
                zoo = new Wolf("Wolf", 4, "wolf", "bleak", 25);
                break;
            default:
                zoo = null;
                break;
        }
        return zoo;
    }
}
