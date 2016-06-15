public class MainForCustomLinkedList {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
       //list.poll();

        System.out.println("Delete first node: " + list.poll());

    }
}