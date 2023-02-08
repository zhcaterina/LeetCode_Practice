class Solution {
    public static int searchInsert(int[] nums, int target) {
        int result = 0;

        if (nums.length == 1) {
            if (nums[0] >= target)
                result = 0;
            else
                result = 1;
        } else {
            if (nums[nums.length-1] < target) {
                result = nums.length;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) {
                        result = i;
                        break;
                    } else if (nums[i] > target) {
                        result = i;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {8}, 7));
    }
}