public class twoSum {
  public static int[] twosum(int[] nums, int target) {
    for (int i = 1; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (nums[j] + nums[j - i] == target) {
          return new int[] { j - i, j };
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 13;
    int[] result = twosum(nums, target);
    if (result != null) {
      System.out.println("Indices: " + result[0] + ", " + result[1]);
    } else {
      System.out.println("No solution found.");
    }

  }
}
