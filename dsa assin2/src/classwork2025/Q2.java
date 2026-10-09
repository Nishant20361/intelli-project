package classwork2025;
import java.util.Scanner;
class complex{
    double real,imag;
    void setDetail() {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the real no");
        real = sc.nextDouble();
        System.out.println("Enter the img");
        imag= sc.nextDouble();
    }
    void display(){
        System.out.println("complex no "+real+" imsginary no "+imag);
    }
     complex add(complex obj1,complex obj2){
        complex obj3= new complex();
        obj3.real=obj1.real+obj2.real;
        obj3.imag=obj1.imag+obj2.imag;
        return obj3;
    }
}
public class Q2 {
    public static void main(String[] args) {
        complex c1=new complex();
        complex c2= new complex();
        c1.setDetail();
        c2.setDetail();
        complex c3=new complex();
        c3=c3.add(c1,c2);
        System.out.println("first complex number ");
        c1.display();
        System.out.println("second complex number ");
        c2.display();
        System.out.println("third complex number ");
        c3.display();

    }


    }

