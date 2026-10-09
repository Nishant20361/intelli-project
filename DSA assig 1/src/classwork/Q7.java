package classwork;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of Array");
        int n= sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int cn=0;
        int firstposition=-1;
        int c=0;
        int lastposition=-1;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                cn=1;
                firstposition=i;
            } else if (a[i]==max) {
            cn++;
            }
            if (firstposition==-1) {
                firstposition = i;
            }

                if (a[i] < min) {
                    min = a[i];
                    c=1;
                    lastposition=i;
                } else if (a[i]==min) {
                c++;
                lastposition=i;
                }
            }
                System.out.println("Maximum element of Array is "+max+"  and occurs "+cn+(cn>1?" times":" time"));
                System.out.println("Minimum element of Array is "+min+"  and occurs "+c+(c>1?" times":" time"));
                System.out.println("First occurrence of maximum element is at position "+(firstposition+1));
                System.out.println("Last occurrence of minimum element is at position "+(lastposition+1));
    }

}
