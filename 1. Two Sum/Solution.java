public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] sum = twoSum(new int[]{2,4,11,3}, 6);
        System.out.println(sum[0]);
        System.out.println(sum[1]);
    }
}
