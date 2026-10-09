package package1;

public class Q10 {
    public static void main(String[] args) {


        int[] arr = {4, 1, 3, 2, 7, 8, 2, 3, 1};
        int sum=0;
        boolean duplicate;
        for (int i = 0; i < arr.length; i++) {
            duplicate=false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate=true;
                        break;
                }
            }
            if (!duplicate)
             sum+=arr[i];
        }
        System.out.println(sum);
    }
}

