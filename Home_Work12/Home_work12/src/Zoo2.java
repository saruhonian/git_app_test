public class Zoo2 {

    public static void main(String[] args) {

        //Animal animal = new Cat();

        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Parrot();
        animals[3] = new Dog();
        animals[4] = new Cat();

        for (Animal animal : animals) {
            //animal.voice();
            animal.walk();
        }
    }
}