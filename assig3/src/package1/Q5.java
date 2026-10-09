package package1;

public class Q5 {
    public static void main(String[] args) {
        int []arr={3,4,5,7,9,5,3,6};
        int repeated=-1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    repeated=arr[i];
                    break;
                }
            }
        }

        if (repeated !=-1){
            System.out.println("First repeated number : "+repeated);
        }
        else {
            System.out.println("no repeated number");
        }
    }
}
