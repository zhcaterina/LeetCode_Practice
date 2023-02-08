class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;

        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
                k++;
            } else {
                res[k] = nums2[j];
                j++;
                k++;
            }
        }

        if (i < m) {
            for (int ii = i; ii < m; ii++) {
                res[k] = nums1[ii];
                k++;
            }
        }

        if (j < n) {
            for (int jj = j; jj < n; jj++) {
                res[k] = nums2[jj];
                k++;
            }
        }

        for(i = 0 ; i < nums1.length; i++) {
            nums1[i] = res[i];
        }

    }

    public static void main(String[] args) {
        int[] num1 = new int[] {1,2,3,0,0,0};
        merge(num1, 3, new int[] {2,5,6}, 3);


    }
}