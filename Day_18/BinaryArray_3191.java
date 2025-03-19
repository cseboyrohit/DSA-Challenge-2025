import java.util.Scanner;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, k = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                k++;
            }
        }

        for (int num : nums) {
            if (num == 0) return -1;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the binary array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Creating an instance of Solution and calling minOperations
        Solution sol = new Solution();
        int result = sol.minOperations(nums);

        // Printing the result
        System.out.println("Minimum operations required: " + result);

        sc.close();
    }
}
