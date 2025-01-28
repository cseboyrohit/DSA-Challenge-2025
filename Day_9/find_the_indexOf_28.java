public class find_the_indexOf_28 {
  public int strStr(String haystack, String needle) {
      // If needle is an empty string, return 0
      if (needle.isEmpty()) {
          return 0;
      }

      // Use indexOf to find the first occurrence of needle in haystack
      return haystack.indexOf(needle);
  }

  public static void main(String[] args) {
    find_the_indexOf_28 solution = new find_the_indexOf_28();
      
      // Test cases
      String haystack1 = "hello";
      String needle1 = "ll";
      System.out.println("Result: " + solution.strStr(haystack1, needle1));  // Output should be 2

      String haystack2 = "aaaaa";
      String needle2 = "bba";
      System.out.println("Result: " + solution.strStr(haystack2, needle2));  // Output should be -1

      String haystack3 = "hello";
      String needle3 = "";
      System.out.println("Result: " + solution.strStr(haystack3, needle3));  // Output should be 0 (since needle is empty)
  }
}
