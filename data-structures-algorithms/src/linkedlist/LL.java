package linkedlist;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public void addHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        size += 1;
    }

    public void addTail(int value) {
        if (tail == null) {
            addHead(value);
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        size += 1;
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addHead(value);
            return;
        } else if (index == size) {
            addTail(value);
            return;
        }

        Node tempHead = head;
        for (int i = 0; i < index; i++) {
            tempHead = tempHead.next;
        }

        Node newNode = new Node(value);
        newNode.next = tempHead.next;
        tempHead.next = newNode;

        size += 1;
    }

    public int removeHead() {
        if (head == null) {
            return -1;
        }

        int value = head.value;
        head = head.next;

        size -= 1;
        return value;
    }

    public int removeTail() {
        if (head == null) {
            return -1;
        }

        if (head == tail) {
            int value = head.value;
            head = null;
            tail = null;

            size -= 1;
            return value;
        }

        Node tempTail = head;
        while (tempTail.next != tail) {
            tempTail = tempTail.next;
        }

        int value = tail.value;
        tail = tempTail;
        tail.next = null;

        size -= 1;
        return value;
    }

    public void display() {
        Node tempHead = head;
        while (tempHead != null) {
            System.out.print(tempHead.value + " -> ");
            tempHead = tempHead.next;
        }

        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
