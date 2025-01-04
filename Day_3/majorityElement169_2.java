public class majorityElement169_2 {
  public static int majorityElementofArray(int[] nums) {
    int candidate = 0;
    int count = 0;
    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }
    return candidate;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElementofArray(arr));
  }
}

// Time Complexity: 0(n)
// Space Complexity: 0(1)
