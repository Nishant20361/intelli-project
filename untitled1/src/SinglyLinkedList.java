
// Node class representing each element in the list
class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class with insertion at first and display
public class SinglyLinkedList {
    Node head; // Head node of the list

    // Method to insert at the beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head;           // Point new node to current head
        head = newNode;                // Update head to new node
    }

    // Method to display the list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.display(); // Output: Linked List: 10 -> 20 -> 30 -> null
    }
}