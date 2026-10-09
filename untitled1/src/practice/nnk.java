package practice;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
    public class nnk {
        Node1 start;

        public void insertFirst(int data) {
            Node1 n = new Node1(data);
            n.next = start;
            start = n;
        }
        void insertPosition(int data,int pos){
            if (pos<1){
                System.out.println("invalid position");
                return;
            }
            Node1 n=new Node1(data);
            if (pos==1){
                n.next=start;
                start=n;
                return;
            }
            Node1 current=start;
            int count=1;
            while (current!=null&&count<pos-1){
                current=current.next;
                count++;
            }
            if (current==null){
                System.out.println("out of bounds");
            }
            else {
                n.next=current.next;
                current.next=n;
            }
        }

        void display() {
            Node1 current = start;
            if (current == null) {
                System.out.println("list is empty");
                return;
            }
            System.out.println("linked list");
            while (current != null) {
                System.out.print(current.data + "  ->  ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            nnk n1 = new nnk();
            int choice;
            do {
                System.out.println("/MENU");
                System.out.println("(1.)Enter at beginning");
                System.out.println("5.Insert at any point");
                System.out.println("2.DISPLAY");
                System.out.println("3.EXIT");
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("ENter  first linked list");
                        int value= sc.nextInt();
                        n1.insertFirst(value); break;
                    case 2:
                        n1.display();
                        break;
                    case 3:
                        System.out.println("Existing");
                        break;
                    case 5:
                        System.out.println("Enter the valur insert");
                        int val2= sc.nextInt();
                        System.out.println("Enter the position");
                        int pos= sc.nextInt();
                        n1.insertPosition(val2,pos);
                    default:
                        System.out.println("try again");
                }

            }while (choice!=3);
            n1.display();
        }
    }
