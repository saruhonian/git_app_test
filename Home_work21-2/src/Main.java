public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add();

        boolean test = list.testOnCycle();
        System.out.println("Test on cycle is " + test + "!!!");

    }
}
