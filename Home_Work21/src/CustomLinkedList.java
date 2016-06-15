public class CustomLinkedList {

    private Node first;
    private Node last;

    private class Node {
        String  value;
        Node next;
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if (last != null) {
            last.next = node;
        }

        last = node;
        if (first == null) {
            first = node;
        }
    }

    public String testOnCycle() {

        return testOnCycle();
    }

    public String poll() {
        String temp = null;
        if (first != last) {
            temp = first.value;
            first = first.next;
        }
        return temp;
    }
}
