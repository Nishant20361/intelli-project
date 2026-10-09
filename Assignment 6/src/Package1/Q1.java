package Package1;

public class Q1 {
    public static int additionSimple(int x, int y) {

        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }public static int multiplicationSimple(int x, int y){
        return x*y;
    }public static double divisionSimple(int x, int y){
        return (double) x /y;
    }public static int remainderSimple(int n, int m){
        return n%m;
    }
    public static double squareRootSimple(int n){
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        System.out.println(additionSimple(12,3));
        System.out.println(subtractionSimple(12,6));
        System.out.println(multiplicationSimple(2,4));
        System.out.println(divisionSimple(12,3));
        System.out.println(remainderSimple(30,4));
        System.out.println(squareRootSimple(81));
    }
}
