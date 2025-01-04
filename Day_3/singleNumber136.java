public class singleNumber136 {
  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums1 = { 2, 2, 1 };
    System.out.println(singleNumber(nums1));

    // Example 2
    int[] nums2 = { 4, 1, 2, 1, 2 };
    int resutl = singleNumber(nums2);
    System.out.println(resutl);
  }
}
