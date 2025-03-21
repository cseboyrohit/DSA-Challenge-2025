import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (k == nums[i]) {
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1}; // Example input
        int missing = solution.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}
