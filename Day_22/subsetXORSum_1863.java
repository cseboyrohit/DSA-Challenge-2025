class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total |= num;
        }
        return total * (1 << (nums.length -1));
    }
   public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3};
        System.out.println(sol.subsetXORSum(nums1));  // Output: 6

        int[] nums2 = {5, 1, 6};
        System.out.println(sol.subsetXORSum(nums2));  // Output: 28

        int[] nums3 = {3, 4, 5, 6, 7, 8};
        System.out.println(sol.subsetXORSum(nums3));  // Output: 480
    }
}
