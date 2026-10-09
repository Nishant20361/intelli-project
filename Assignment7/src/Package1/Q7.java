package Package1;
public class Q7 {
    public  static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i+2; k < n; k++) {
                    if (nums[i] + nums[j]+nums[k] == target) {
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return null;
    }
    public static void main (String[]args){
        int []nums={2,3,4,5,6,7,1,5};
        int target=9;
        int [] result= twoSum(nums, target);
        System.out.println(result[0]+" , "+result[1]+" , "+result[2]);

    }
}