public class MinSizeSubArray_209 {
  public static int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      int minLen = Integer.MAX_VALUE;  // To track the minimum length of the valid subarray
      int currentSum = 0;  // To keep the sum of the current window
      int left = 0;  // Left pointer of the sliding window
      
      // Iterate through the array with the right pointer
      for (int right = 0; right < n; right++) {
          currentSum += nums[right];  // Expand the window by adding the current element
          
          // Shrink the window when the sum is greater than or equal to the target
          while (currentSum >= target) {
              minLen = Math.min(minLen, right - left + 1);  // Update minLen if a smaller subarray is found
              currentSum -= nums[left];  // Subtract the element at the left pointer
              left++;  // Shrink the window from the left
          }
      }

      // If minLen was updated, return it; otherwise, return 0 as no valid subarray was found
      return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }

  public static void main(String[] args) {
      // Example usage:
      System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); // Output: 2
      System.out.println(minSubArrayLen(4, new int[]{1, 4, 4})); // Output: 1
      System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})); // Output: 0
  }
}

