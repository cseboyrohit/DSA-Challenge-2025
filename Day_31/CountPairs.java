import java.util.Arrays;

public class CountPairs {
    public static int countPairs(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array first
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                // All elements from left+1 to right will form valid pairs with nums[left]
                count += (right - left);
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4};
        int target = 7;

        int result = countPairs(nums, target);
        System.out.println("Number of valid pairs: " + result);
    }
}
