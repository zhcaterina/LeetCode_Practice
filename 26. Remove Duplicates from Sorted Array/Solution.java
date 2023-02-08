class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int number = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[number] = nums[i + 1];
                number++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,1,2, 3, 3, 4}; // Input array
        int[] expectedNums = new int[] {-1,1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        System.out.println(k == expectedNums.length);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] == expectedNums[i]);
        }
    }
}