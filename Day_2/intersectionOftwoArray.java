import java.util.ArrayList;
import java.util.List;

class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> resultList = new ArrayList<>();

    // Iterate through each element of nums1
    for (int i = 0; i < nums1.length; i++) {
      // Check if the current element in nums1 is in nums2
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j] && !resultList.contains(nums1[i])) {
          resultList.add(nums1[i]); // Add the element to resultList if not already added
          break; // No need to check further once a match is found
        }
      }
    }

    // Convert the result list to an array
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      result[i] = resultList.get(i);
    }

    return result;
  }

  public static void main(String[] args) {
    IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

    int[] nums1 = { 1, 2, 2, 1 };
    int[] nums2 = { 2, 2 };
    int[] intersection1 = solution.intersection(nums1, nums2);
    System.out.print("Intersection of nums1 and nums2: ");
    for (int num : intersection1) {
      System.out.print(num + " ");
    }
    System.out.println();

    // Example 2:
    int[] nums1_2 = { 4, 9, 5 };
    int[] nums2_2 = { 9, 4, 9, 8, 4 };
    int[] intersection2 = solution.intersection(nums1_2, nums2_2);
    System.out.print("Intersection of nums1_2 and nums2_2: ");
    for (int num : intersection2) {
      System.out.print(num + " ");
    }
  }
}
