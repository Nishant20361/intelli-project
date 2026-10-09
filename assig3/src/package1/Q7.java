package package1;

public class Q7 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,6};
        int n= arr.length+1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        int total=n*(n+1)/2;
        int missingNumber=total -sum;
        System.out.println(missingNumber);
    }
}
