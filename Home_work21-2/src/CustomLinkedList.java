public class CustomLinkedList {
    private Node first;
    private Node last;

    private class Node {
        int value;
        Node next;
    }

    public void add() {
        int val = 0;
        Node temp = null;
        for (val = 1; val < 10; val++) {
            Node node = new Node();
            node.value = 0;
            node.next = null;

            if (first == null) {
                node.value = val;
                first = node;
            }
            if (last != null) {
                if (val == 3) {

                    temp = node;
                }

                if (val == 8) {
                    node.value = val;
                    last.next = temp;
                }
                if (val != 8) {
                    node.value = val;
                    last.next = node;
                }
            }
            last = node;

        }
    }

    public boolean testOnCycle() {
        Node slow = first.next;
        Node fast = first.next.next;

        while (fast != slow && fast.next != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }


}
