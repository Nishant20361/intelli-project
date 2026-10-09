package homework;
import java.util.*;
public class HW2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String []lines=new String[100];
        System.out.println("Enter the string");
        int count =0;
        for (int i = 0; i < 100; i++) {
            String l= sc.nextLine();
            if (l.length()==0)
                break;
            lines[count++] = l;
        }
        for (int i = count-1; i >=0 ; i--) {
            System.out.println(lines[i]);
        }
    }
}
