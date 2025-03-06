import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];

        // Step 1: Merge both arrays
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        // Step 2: Find the median
        int len = merged.length;
        if (len % 2 == 1) {
            return merged[len / 2];  // Odd length → middle element
        } else {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;  // Even length → avg of middle two
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1,3}, nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1,2}, nums4 = {3,4};
        System.out.println(solution.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}
