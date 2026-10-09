package Package1;

public class Q8 {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; // Return indices when the sum is found
                    }
                }
            }
            return new int[]{-1,-1,-1}; // If no solution is found (assuming there's always a valid pair)
        }

        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6,4};
            int target = 9;

            int[] result = twoSum(nums, target);
            System.out.println(result[0] + " " + result[1]); // Print indices
        }
    }

