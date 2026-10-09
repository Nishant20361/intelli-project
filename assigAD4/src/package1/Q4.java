package package1;

public class Q4 {
    public static void main(String[] args) {
        int[]n={4, 8, 1, 2, 16, 15 };
        int sum=0;
        for (int num:n){
            sum+=num;
        }
        boolean found= false;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i]+n[j]==sum/2){
                    System.out.println(n[i]+" , "+n[j]);
                    found=true;
                }
                
            }
            
        }
        if(!found){
            System.out.println("No such pair exist");
        }
    }
}
