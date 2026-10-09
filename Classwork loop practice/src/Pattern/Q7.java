package Pattern;

public class Q7 {
    public static void main(String[] args) {
        int row=5;
        for (int i=1;i<=row;i++)
        {
            for (int j=1,c=65;j<=i;j++)
            {
                System.out.print("\t"+(char)c++ );
            }
            System.out.println("");
        }
    }
}
