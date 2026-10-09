package Package1;

public class Q4 {
    public static int leaf(int n) {
         if (n%4==0&&n%100!=0||n%400==0){
            return 366;
         }else {
             return 365;
         }

    }

    public static void main(String[] args) {
        for (int n = 2000; n <=2050 ; n++) {
            System.out.println(n+" : "+leaf(n));

        }

        }
    }

