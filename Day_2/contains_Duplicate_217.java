public class contains_Duplicate_217 {
  // brute Fore
  public static boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j])
          return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    // containsDuplicate(arr);
    System.out.println(containsDuplicate(arr));
  }
}