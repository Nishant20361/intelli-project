package classwork2025;
abstract class shape{

    }
   class square  extends shape{
    double side;
    square(double s){
        side=s;
    }
    void area(){
           System.out.println("The area of square "+(side*side));
       }
   }
   class triangle extends shape{
    double base,height;
    triangle(double b,double h){
        base=b;
        height=h;
    }
       void area() {
           System.out.println("The area of triangle "+(0.5*height*base));
       }
   }
   class circle extends shape{
    double radi;
    circle(double r){
        radi=r;
    }
    void area(){
        System.out.println("The area of circle "+(Math.PI*radi*radi));
    }
   }

public class Q5 {
    public static void main(String[] args) {


        new square(3).area();
        new triangle(2,4).area();
        new circle(3).area();
    }
}
