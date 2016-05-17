public class Dog extends Animal {

    Dog() {
        name = "Pluto";
        age = 3;
        weight = 10;
    }

    public void voice() {
        System.out.println("Bark");
    }

    public void walk() {
        System.out.println("Tup");
    }

    public boolean canFly() {
        return false;
    }
}