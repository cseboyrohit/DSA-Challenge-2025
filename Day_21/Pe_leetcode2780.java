
public class Solution {

    public int minimumIndex(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the dominant element of the entire array.
        // Since the array has exactly one dominant element, its frequency must be more than n/2.
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        
        // Verify candidate frequency in the entire array.
        int totalCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                totalCount++;
            }
        }
        
        // Since it's guaranteed to have one dominant element,
        // candidate is our dominant element.
        int dominant = candidate;
        
        // Step 2: Iterate through the array to check for a valid split.
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            // Increase leftCount if the current element equals the dominant element.
            if (nums[i] == dominant) {
                leftCount++;
            }
            
            // Left subarray length is i + 1
            // Check if dominant is dominant in left part: count > (i + 1) / 2
            if (leftCount * 2 <= (i + 1)) {
                continue; // dominant is not dominant in the left part
            }
            
            // Right subarray length is n - i - 1
            // The count for dominant in the right part is totalCount - leftCount.
            if ((totalCount - leftCount) * 2 <= (n - i - 1)) {
                continue; // dominant is not dominant in the right part
            }
            
            // If both parts have the dominant element as dominant, return the index.
            return i;
        }
        
        // If no valid split found, return -1.
        return -1;
    }
    
    // Main method to test the solution.
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] nums1 = {1, 2, 2, 2};
        System.out.println("Minimum valid split index for nums1: " + solution.minimumIndex(nums1));
        // Expected output: 2
        
        // Example 2
        int[] nums2 = {2, 1, 3, 1, 1, 1, 7, 1, 2, 1};
        System.out.println("Minimum valid split index for nums2: " + solution.minimumIndex(nums2));
        // Expected output: 4
        
        // Example 3
        int[] nums3 = {3, 3, 3, 3, 7, 2, 2};
        System.out.println("Minimum valid split index for nums3: " + solution.minimumIndex(nums3));
        // Expected output: -1
    }
}
