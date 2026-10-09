package package1;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 2, 3, 3, 3};
        int n = arr.length;
        int max=0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
            if(max<count){
                max=count;
                element=arr[i];
            }
        }
        System.out.println("Element appearing most times : "+element);
        System.out.println("it appear "+max);
    }
}
