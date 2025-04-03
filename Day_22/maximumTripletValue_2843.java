import java.util.Scanner;

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxValue = 0; // Use long to prevent overflow
        
        for (int j = 1; j < n - 1; j++) {
            int max_i = nums[0]; // Initialize with first element
            
            for (int i = 0; i < j; i++) {  
                max_i = Math.max(max_i, nums[i]);
            }
            
            for (int k = j + 1; k < n; k++) {
                long value = (long) (max_i - nums[j]) * nums[k]; // Explicit cast to long
                maxValue = Math.max(maxValue, value);
            }
        }
        
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Create an instance of Solution and call the function
        Solution solution = new Solution();
        long result = solution.maximumTripletValue(nums);

        // Print the result
        System.out.println("Maximum Triplet Value: " + result);

        scanner.close();
    }
}
