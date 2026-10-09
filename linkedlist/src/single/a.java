package single;
import java.util.*;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class a {
    node head;

    void insert(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    void insFst(int data){
        node n=new node(data);
        head=n.next;
        head=n;
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void sum() {
        node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a list = new a();

        System.out.println("Enter elements (-1 to stop): ");
        while (true) {
            int data = sc.nextInt();
            if (data == -1) break;
            list.insert(data);
        }

        System.out.println("Linked List:");
        list.display();
    }
}