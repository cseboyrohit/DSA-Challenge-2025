public class longestCommonPrefix_14 {
  public String longestCommonPrefix(String[] strs) {
      String str1 = strs[0];
      for(int i = 1; i < strs.length; i++) {
          str1 = helper(str1, strs[i]);
      }
      return str1;
  }

  public String helper(String str1, String str2) {
      StringBuilder str = new StringBuilder();
      int min = Math.min(str1.length(), str2.length());

      for(int i = 0; i < min; i++) {
          if(str1.charAt(i) == str2.charAt(i)) {
              str.append(str1.charAt(i));
          } else {
              break;
          }
      }
      return str.toString();
  }

  public static void main(String[] args) {
    longestCommonPrefix_14 solution = new longestCommonPrefix_14();
      
      // Example 1
      String[] strs1 = {"flower", "flow", "flight"};
      System.out.println("Longest common prefix: " + solution.longestCommonPrefix(strs1)); // Output: "fl"
      
      // Example 2
      String[] strs2 = {"dog", "racecar", "car"};
      System.out.println("Longest common prefix: " + solution.longestCommonPrefix(strs2)); // Output: ""
      
      // Example 3
      String[] strs3 = {"apple", "appetizer", "application"};
      System.out.println("Longest common prefix: " + solution.longestCommonPrefix(strs3)); // Output: "app"
  }
}
