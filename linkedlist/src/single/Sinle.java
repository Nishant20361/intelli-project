package single;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Sinle {
    Node head;

    // Insert at beginning
    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    // Insert at specific position
    void insertPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }
        Node n = new Node(data);
        if (pos == 1) {
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bound");
        } else {
            n.next = temp.next;
            temp.next = n;
        }
    }

    // Insert at the end
    void insertLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Sinle list = new Sinle();
        list.insertFirst(3);        // List: 3
        list.insertPosition(4, 2);  // List: 3 -> 4
        list.insertLast(7);
        list.insertLast(5);
        list.display();
    }
}