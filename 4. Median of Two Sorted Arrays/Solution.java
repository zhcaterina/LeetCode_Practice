class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int[] nums3 = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }

        if (i >= nums1.length) {
            for (int jj = j; jj < nums2.length; jj++) {
                nums3[k] = nums2[jj];
                k++;
            }
        }

        if (j >= nums2.length) {
            for (int ii = i; ii < nums1.length; ii++) {
                nums3[k] = nums1[ii];
                k++;
            }
        }

        if (nums3.length % 2 == 0) {
            result = ((nums3[nums3.length/2-1]) + (nums3[nums3.length/2]) + 0.0) / 2;
        } else {
            result = nums3[nums3.length/2];
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
    }
}