package Package1;
import java.util.Scanner;
public class Q6 {
    public static int count(String s,char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String s= sc.next();
        System.out.println(" enter the character to count ");
        char c=sc.next().charAt(0);
        int cont=count(s,c);
        System.out.println(cont);
    }
}
