package classwork;
public class Q1 {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        int n= Integer.parseInt(args[0]);
        int count =0;
        while (n>2){
            n=n/2;
            count++;
        }
        System.out.println(count);

    }
}
