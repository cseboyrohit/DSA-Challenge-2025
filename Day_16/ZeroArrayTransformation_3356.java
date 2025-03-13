import java.util.*;

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int sum = 0, queryCount = 0;
        int[] diffArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            while (sum + diffArray[i] < nums[i]) {
                queryCount++;
                if (queryCount > queries.length) return -1;

                int left = queries[queryCount - 1][0];
                int right = queries[queryCount - 1][1];
                int value = queries[queryCount - 1][2];

                if (right >= i) {
                    diffArray[Math.max(left, i)] += value;
                    if (right + 1 < diffArray.length) {
                        diffArray[right + 1] -= value;
                    }
                }
            }
            sum += diffArray[i];
        }
        return queryCount;
    }

    // Static main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for nums array
        System.out.print("Enter size of nums array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input for queries
        System.out.print("Enter number of queries: ");
        int q = scanner.nextInt();
        int[][] queries = new int[q][3];

        System.out.println("Enter queries (li ri vali):");
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }

        // Create an instance of Solution and call minZeroArray
        Solution sol = new Solution();
        int result = sol.minZeroArray(nums, queries);

        // Output the result
        System.out.println("Minimum queries required: " + result);

        scanner.close();
    }
}
