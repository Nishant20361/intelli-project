package doubleLinkedList;

public class pract {
    static class node1{
        int data;
        node1 next;
        node1 prev;
        node1(int data){
            this.data=data;
        }
    }
   static void display(node1 head){
        node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
       System.out.println();
    }
    static void displayPrev(node1 tail){
        node1 temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void display2(node1 random) {
        node1 temp = random;
        //move this node backward to the head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        //now temp is at head
        // print the list
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }
    public static void main(String[] args) {

        node1 a=new node1(1);
        node1 a1=new node1(2);
        node1 a2=new node1(3);
        node1 a3=new node1(4);
        node1 a4=new node1(15);
        node1 a5=new node1(16);
        a.prev=null;
        a.next=a1;
        a1.prev=a;
        a1.next=a2;
        a2.prev=a1;
        a2.next=a3;
        a3.prev=a2;
        a3.next=a4;
        a4.prev=a3;
        a4.next=a5;
        a5.prev=a4;
        a5.next=null;
        display(a);
        displayPrev(a5);
        display2(a4);
    }

}
