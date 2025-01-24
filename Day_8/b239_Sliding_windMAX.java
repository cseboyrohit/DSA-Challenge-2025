import java.util.*;

public class b239_Sliding_windMAX {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case: If nums is empty or k is 1, return nums
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];  // Array to store the results

        // Iterate over the array to cover all windows
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];  // Start with the first element in the window
            // Find the maximum in the current window
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;  // Store the maximum in the result array
        }
        
        return result;
    }

    public static void main(String[] args) {

        // Test case 1
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums1, k1)));  // Output: [3, 3, 5, 5, 6, 7]
        
        // Test case 2
        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums2, k2)));  // Output: [1]
    }
}
