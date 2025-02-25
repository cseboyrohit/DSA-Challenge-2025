class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007; // 10^9 + 7
        int oddCount = 0, evenCount = 1; // evenCount starts as 1 (empty prefix sum is even)
        int prefixSum = 0, result = 0;

        for (int num : arr) {
            prefixSum += num; // Update prefix sum
            
            if (prefixSum % 2 == 0) { 
                result = (result + oddCount) % MOD; // Add all subarrays ending here with odd sum
                evenCount++; // Increment even prefix count
            } else {
                result = (result + evenCount) % MOD; // Add all subarrays ending here with odd sum
                oddCount++; // Increment odd prefix count
            }
        }
        
        return result;
    }
}
