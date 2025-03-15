class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        
        // Find the min and max value in nums
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        // Binary search for the minimum capability
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canRobWithCapability(nums, k, mid)) {
                right = mid; // Try lower capability
            } else {
                left = mid + 1; // Increase capability
            }
        }

        return left; // Minimum capability required
    }

    private boolean canRobWithCapability(int[] nums, int k, int cap) {
        int count = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] <= cap) { // Rob this house
                count++;
                i++; // Skip adjacent house
            }
            i++; // Move to next house
        }
        return count >= k;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 5, 9};
        int k1 = 2;
        System.out.println(solution.minCapability(nums1, k1)); // Output: 5
        
        int[] nums2 = {2, 7, 9, 3, 1};
        int k2 = 2;
        System.out.println(solution.minCapability(nums2, k2)); // Output: 2
    }
}
