public class validPalindrome_125 {
  public boolean isPalindrome(String s) {
      // Step 1: Normalize the string
      StringBuilder cleanedString = new StringBuilder();
      
      // Iterate through each character in the string
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          
          // If the character is alphanumeric, convert it to lowercase and add to the cleaned string
          if (Character.isLetterOrDigit(c)) {
              cleanedString.append(Character.toLowerCase(c));
          }
      }
      
      // Step 2: Check if the string is a palindrome
      int left = 0;
      int right = cleanedString.length() - 1;
      
      // Compare characters from both ends towards the center
      while (left < right) {
          if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
              return false; // Not a palindrome
          }
          left++;
          right--;
      }
      
      return true; // It is a palindrome
  }
  public static void main(String[] args) {
    validPalindrome_125 solution = new validPalindrome_125();
    
    // Test cases
    String test1 = "A man, a plan, a canal: Panama";
    String test2 = "race a car";
    String test3 = " ";
    
    // Calling the isPalindrome method and printing the results
    System.out.println("Test 1: " + test1 + " => " + solution.isPalindrome(test1));  // true
    System.out.println("Test 2: " + test2 + " => " + solution.isPalindrome(test2));  // false
    System.out.println("Test 3: " + test3 + " => " + solution.isPalindrome(test3));  // true
}
}
