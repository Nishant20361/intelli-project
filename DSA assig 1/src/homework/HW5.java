package homework;
import java.util.*;
public class HW5 {
    public static void main(String[] args) {
        int countrow=0,countcol=0;
        Scanner sc = new Scanner(System.in);
//int []countrow=new int[4],countcol=new int[4];
        int[][] a = new int[4][4];
        System.out.println("neter the  of array b/w 0 and 1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (int)(Math.random()*2);
                System.out.print(a[i][j] + " ");
                if (a[i][j]==1){
                    countrow++;
                    countcol++;
                }
            }
            System.out.println();
        }
        System.out.println(countrow);
        System.out.println(countcol);
    }
}