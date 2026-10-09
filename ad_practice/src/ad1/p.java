package ad1;
import java.util.*;
public class p {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={2,4,1};
        int []c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[i+a.length]=b[i];
        }
        Arrays.sort(c);
        for(int num:c)
        {
            System.out.print(num+" , ");
        }

    }
}
