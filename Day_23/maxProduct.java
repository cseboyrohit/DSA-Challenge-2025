class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int n = arr.length;
        int result = arr[0]; // Initial result
        
        for(int i = 0; i < n; i++) {
            int mul = 1;
            for(int j = i; j < n; j++) {
                mul *= arr[j];
                result = Math.max(result, mul); // Should be inside inner loop
            }
        }
        
        return result;
    }
}
