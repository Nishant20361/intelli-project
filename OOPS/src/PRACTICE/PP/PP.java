package PRACTICE.PP;
import java.util.Scanner;
class nishant{
    public void print(){
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(age);

    }
    String fname,lname;
    int age;
}
public class PP {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        nishant n= new nishant();
        n.fname= sc.next();
        n.lname=sc.next();
        n.age= sc.nextInt();
       n.print();
//        System.out.println(n.fname);
//        System.out.println(n.lname);
//        System.out.println(n.age);
    }
}
