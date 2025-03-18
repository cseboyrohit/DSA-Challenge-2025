class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 1;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int bitwiseAND = 0;
            for (int j = i; j < n; j++) {
                if ((bitwiseAND & nums[j]) == 0) { // Valid pair
                    bitwiseAND |= nums[j]; // Add to set
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break; // Stop if invalid
                }
            }
        }
        return maxLen;
    }
}
