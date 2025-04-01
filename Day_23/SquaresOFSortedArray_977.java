import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) { 
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int square = nums[i] * nums[i];
            result[i] = square;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredSorted = sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(squaredSorted));
    }
}
