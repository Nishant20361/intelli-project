package Package1;

import java.util.Scanner;

public class Q7 {
    public static int count(String s) {
        int vowel = 0;
        int a;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }

        }
        return vowel;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println(" Enter the word");
        String s= sc.next();
        System.out.println(count(s));

    }
}

