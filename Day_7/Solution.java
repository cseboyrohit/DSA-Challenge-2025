import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to use the two-pointer approach
        Arrays.sort(nums);
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same element to avoid duplicates in the result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use two pointers to find pairs that sum up to the target (-nums[i])
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet, add it to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Move the left pointer to the right to increase the sum
                    left++;
                } else {
                    // Move the right pointer to the left to decrease the sum
                    right--;
                }
            }
        }
        
        return result;
    }
}

