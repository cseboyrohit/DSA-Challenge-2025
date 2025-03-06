import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1]; // Frequency array
        
        int repeated = -1;
        int missing = -1;

        // Step 1: Count occurrences
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        // Step 2: Find Repeated and Missing Numbers
        for (int num = 1; num <= size; num++) {
            if (count[num] == 2) {
                repeated = num; // Number appears twice
            } else if (count[num] == 0) {
                missing = num; // Number is missing
            }
        }

        // Step 3: Return Result
        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid1 = {{1, 3}, {2, 2}};
        System.out.println(Arrays.toString(solution.findMissingAndRepeatedValues(grid1))); // Output: [2, 4]

        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        System.out.println(Arrays.toString(solution.findMissingAndRepeatedValues(grid2))); // Output: [9, 5]
    }
}
