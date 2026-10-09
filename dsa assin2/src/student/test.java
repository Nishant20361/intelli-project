package student;

import java.util.Scanner;

public class test extends student{
        protected int mark1;
    protected int mark2;
protected void input(){
       Scanner sc=new Scanner(System.in);
    System.out.println("enter the mark1 ");
    mark1= sc.nextInt();
    System.out.println("enter the mark2 ");
    mark2= sc.nextInt();

}
   protected void display(){
       System.out.println("Name "+name);
       System.out.println("Roll no "+roll);
       System.out.println("mark1 "+mark1);
       System.out.println("mark2 "+mark2);

   }
}
