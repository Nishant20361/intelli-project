package package1;
/*Write a program to print the following outputs using for loops:
(a) A
    A B
    A B C
    A B C D
    A B C D E

(b) $ $ $ $ $
    $ $ $ $
    $ $ $
    $ $
    $

(c)         1
          2 2
        3 3 3
      4 4 4 4
    5 5 5 5 5*/
public class Q7 {
    public static void main(String[] args) {
        int row = 5;
        System.out.println("(a)");
        for (int i = 1; i <= row; i++) {
            for (int j = 1, c = 65; j <= i; j++) {
                System.out.print((char) c++ + "  ");
            }
            System.out.println("");
        }
        System.out.println("(b)");
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print("$  ");
            }
            System.out.println(" ");
        }
        System.out.println("(d)");
        for (int i = 1; i <= row; i++) {
            for (int j =i; j <= row; j++) {
                System.out.print("   ");
            }

            for (int j =1; j <= i; j++) {
                System.out.print("  "+i);
            }
            System.out.println(" ");
        }
    }
}