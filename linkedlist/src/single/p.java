package single;

class Node1{
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class p {
    Node1 head;
    public void insertFirst(int data){
        Node1 n = new Node1(data);
        n.next = head;
        head = n;
    }
    void insertLast(int data){
        Node1 n = new Node1(data);
        if(head == null){
            head = n;
            return;
        }
        Node1 temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=n;
    }
    void delete(int data){
        Node1 n=new Node1(data);
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node1 temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                return;
            }
        }


    }
    void insertAtAnyPointer(int data,int index){
        Node1 n=new Node1(data);
        if(index<1){
            System.out.println("invalid index");
            return;
        }
        if (index==1){
            n.next=head;
            head=n;
            return;
        }
        Node1 temp=head;
        int count=1;
        while(temp!=null && count<index-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("invalid index");
        }else {
            n.next=temp.next;
            temp.next=n;
        }
    }
    void display(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        p obj = new p();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertLast(4);
        obj.insertLast(5);
        obj.insertAtAnyPointer(7,2);
        obj.display();
//        obj.delete(obj.head.data);
//        obj.delete(1);
//
//        obj.display();


    }
}
