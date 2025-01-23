
  public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE; // Initialize to infinity to track the minimum length
        
        // Try every possible subarray
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j]; // Add the current element to the current sum
                if (currSum >= target) {
                    minLen = Math.min(minLen, j - i + 1); // Update the minimum length if needed
                    break; // Once we find a valid subarray, break out of the loop
                }
            }
        }

        // If minLen was updated, return it; otherwise, return 0 as no valid subarray exists
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); // Output: 2
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4})); // Output: 1
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})); // Output: 0
    }
}
