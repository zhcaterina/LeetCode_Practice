import static java.util.Arrays.sort;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int res = 0;
        int[] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums2[res] = nums[i];
                res++;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            nums[i] = nums2[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {1,2}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        System.out.println(k == expectedNums.length);
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] == expectedNums[i]);
        }
    }
}