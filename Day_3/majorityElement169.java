import java.util.Arrays;

public class majorityElement169 {
  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3 };
    int result = majorityElement(nums);
    System.out.println(result);
  }
}
// Time Complexity: 0(n log n)(due to sorting)
// Space Complexity: 0(1)
