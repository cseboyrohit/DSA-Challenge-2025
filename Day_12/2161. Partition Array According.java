import java.util.Arrays;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        // First pass: Add elements less than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }

        // Second pass: Add elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        // Third pass: Add elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {9, 12, 5, 10, 14, 3, 10};
        int pivot1 = 10;
        System.out.println(Arrays.toString(solution.pivotArray(nums1, pivot1)));
        // Output: [9, 5, 3, 10, 10, 12, 14]

        // Test case 2
        int[] nums2 = {-3, 4, 3, 2};
        int pivot2 = 2;
        System.out.println(Arrays.toString(solution.pivotArray(nums2, pivot2)));
        // Output: [-3, 2, 4, 3]
    }
}
