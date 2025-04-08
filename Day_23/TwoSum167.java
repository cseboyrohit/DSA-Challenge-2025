using System;

public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.Length - 1;
        
        while (start < end) {
            int store = numbers[start] + numbers[end];
            
            if (store == target) {
                ans[0] = start + 1; 
                ans[1] = end + 1;
                return ans;
            }
            else if (store < target) {
                start++;
            }
            else {
                end--;
            }
        }
        
        return ans;
    }

    // Main method
    public static void Main(string[] args) {
        Solution obj = new Solution();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.TwoSum(numbers, target);

        Console.WriteLine("Index 1: " + result[0]);
        Console.WriteLine("Index 2: " + result[1]);
    }
}
