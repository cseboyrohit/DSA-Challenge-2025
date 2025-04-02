class Solution {
    public int maxTripletValue(int[] nums) {
        int n = nums.length;
        int maxVal = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int value = (nums[i] - nums[j]) * nums[k];
                    maxVal = Math.max(maxVal, value);
                }
            }
        }
        return maxVal;
    }
}
