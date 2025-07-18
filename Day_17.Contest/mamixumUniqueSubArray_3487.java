import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = -101;

        for (int num : nums) {
            if (num >= 0) set.add(num);
            if (num < 0) {
                min = Math.max(min, num);
            }
        }

        if (set.isEmpty()) {
            return min;
        }

        int sum = 0;
        for (int s : set) {
            sum += s;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5}; 
        int[] nums2 = {1, 1, 0, 1, 1}; 
        int[] nums3 = {1, 2, -1, -2, 1, 0, -1}; 
        int[] nums4 = {-5, -10, -3, -4};  // Only negative numbers case

        System.out.println(sol.maxSum(nums1)); // Output: 15
        System.out.println(sol.maxSum(nums2)); 
        System.out.println(sol.maxSum(nums3)); // Output: 3
        System.out.println(sol.maxSum(nums4)); // Output: -3 (max negative)
    }
}
