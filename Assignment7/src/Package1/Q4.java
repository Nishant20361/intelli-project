package Package1;

public class Q4 {
    public static double min(double[]arr){
        double min=Integer.MAX_VALUE;
        for (double e:arr){
            if (e<min){
                min=e;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double[]arr={ 12,12,12,34,6,7,3,7,6,90,-2};
        System.out.println(min(arr));
    }
}
