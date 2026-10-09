package Package1;
import java.util.Scanner;
public class Q9 {
    public static boolean password(String s) {
        if (s.length() < 8) {
            return false;
        }
        boolean digit = false;
        boolean letter = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    digit = true;
                    count++;
                }
               else if (Character.isLetter(c)) {
                    letter = true;
                }else {
                    return false;

                }
                }


        return (digit&&letter&&count>=2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String s= sc.next();
        System.out.println(password(s));
    }
}
