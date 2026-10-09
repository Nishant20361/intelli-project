package single;
class  Node2{
    int data;
    Node2 next;
    public  Node2(int data){
        this.data=data;
        next=null;
    }
}
public class prac {
    Node2 head;
    void insert(int data){
        Node2 n=new Node2(data);
        n.next=head;
        head=n;
    }
    void insert_last(int data){
        Node2 n=new Node2(data);
        if(head==null){
            head=n;
            return;
        }
        Node2 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }

    void display() {
        Node2 temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
}
public static void main(String[] args) {
        prac p=new prac();
        p.insert(10);
        p.insert(20);
        p.insert(30);
        p.insert(40);
        p.display();
        p.insert_last(32);
        p.display();
}
}