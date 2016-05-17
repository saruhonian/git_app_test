public class Parrot extends Animal {

    Parrot() {
        name = "Blue Parrot";
        age = 6;
        weight = 1;
    }

    public void voice() {
        System.out.println("Parrot");
    }

    public void walk() {
        System.out.println("Skok");
    }

    public boolean canFly() {
        return true;
    }
}