import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class m_3Sum_15 {
  public static List<List<Integer>> threeSum(int[] nums) {
    int target = 0;
    Arrays.sort(nums);
    Set<List<Integer>> uniqueTriplets = new HashSet<>();
    List<List<Integer>> output = new ArrayList<>();
    
    for (int left = 0; left < nums.length - 2; left++) {
      if (left > 0 && nums[left] == nums[left - 1]) continue; // Skip duplicate elements
      int leftNext = left + 1;
      int right = nums.length - 1;
      while (leftNext < right) {
        int sum = nums[left] + nums[leftNext] + nums[right];
        if (sum == target) {
          uniqueTriplets.add(Arrays.asList(nums[left], nums[leftNext], nums[right]));
          leftNext++;
          right--;
          while (leftNext < right && nums[leftNext] == nums[leftNext - 1]) leftNext++; // Skip duplicate elements
          while (leftNext < right && nums[right] == nums[right + 1]) right--; // Skip duplicate elements
        } else if (sum < target) {
          leftNext++;
        } else {
          right--;
        }
      }
    }
    output.addAll(uniqueTriplets);
    return output;
  }

  public static void main(String[] args) {
    int[] nums1 = {-1, 0, 1, 2, -1, -4}; // Expected: [[-1, -1, 2], [-1, 0, 1]]
    List<List<Integer>> result1 = threeSum(nums1);
    System.out.println(result1); // Print the result
  }
}
