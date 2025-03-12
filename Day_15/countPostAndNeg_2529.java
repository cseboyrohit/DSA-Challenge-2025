class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0, posCount = 0;
        
        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }
        
        return Math.max(negCount, posCount);
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {-2,-1,-1,1,2,3};
        System.out.println(sol.maximumCount(nums1)); // Output: 3
        
        int[] nums2 = {-3,-2,-1,0,0,1,2};
        System.out.println(sol.maximumCount(nums2)); // Output: 3
        
        int[] nums3 = {5,20,66,1314};
        System.out.println(sol.maximumCount(nums3)); // Output: 4
    }
}
