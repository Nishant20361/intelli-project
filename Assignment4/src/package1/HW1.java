package package1;
/*Write a java program to find the difference between the sum of the squares of the first ten
natural numbers and the square of the sum.
The sum of the squares of the first ten natural numbers is:
12 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 + 102 = 385
The square of the sum of the first ten natural numbers is:
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first
ten natural numbers and the square of the sum is 3025 − 385 =
2640.*/
public class HW1 {
    public static void main(String[] args) {
        int a=0,b=0,c=1,diff=0;
        System.out.print("the sum of the square of the first natural number is : ");
        for (int i=1;i<=10;i++){
            a+=i;
          c=a*a;
            b+=i*i;
            diff=c-b;
            System.out.print(i+"^2 + ");
        }
        System.out.println(" = "+b);
        System.out.println("the square of the sum of the first ten natural numbers is: \n"+a+"^2 ="+c);
        System.out.println("Hence the difference between the square  "+diff);

    }

}
