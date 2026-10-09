package Package1;

public class Q10 {
    public static double triangle(int a,int b){
        return 0.5*a*b;
    }
    public static int square(int a){
        return a*a;
    }
    public static double circle(int r){
        return Math.PI*r*r;
    }
    public static int rectangle(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(triangle(3,4));
        System.out.println(square(5));
        System.out.println(circle(5));
        System.out.println(rectangle(3,4));
    }

}
