package Pattern;

public class Q10 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++)
        {
            for (int j = row; j >= 1; j--)
            {
                if (i == j)
                {
                    System.out.print("\t*");
                }
                if(i!=j)
                    System.out.print("\t"+j);


            }
            System.out.println();
        }
    }
}