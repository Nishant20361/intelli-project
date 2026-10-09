package package1;

public class Q2 {
    public static void main(String[] args) {
         int value=4;
         int []a={1,5,4,3,7};
         int []b={2,9,6,7,8};
        for (int k : a) {
            for (int i : b) {
                if (Math.abs(k - i) == value) {
                    System.out.print("(" + k + "," + i + ")");
                }

            }

        }

    }
}
