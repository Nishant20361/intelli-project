package Package1;
/*uestion-10:
A University conducts a 100-mark exam for its student and grades them as follows.
Assigns a grade based on the value of the marks. Write a java program to print the
grade according to the mark secured by the student. [Use switch-case].
Mark Range Letter Grade
>=90 O
>=80 AND <90 A
>=70 AND <80 B
>=60 AND <70 C
>=50 AND <60 D
>=50 AND <40 E
<40 F*/
import  java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark");
    int marks= sc.nextInt();
    int m=marks/10;
    switch (m) {
        case 9, 10:
            System.out.println("O");
            break;
        case 8:
            System.out.println("A");
            break;
        case 7:
            System.out.println("B");
            break;
        case 6:
            System.out.println("C");
            break;
        case 5:
            System.out.println("D");
            break;
        case 4:
            System.out.println("E");
            break;
        case 3, 2, 1:
            System.out.println("F");
            break;
        default:




    }
    }
}
