public class ClearDigit_3174 {
  public String clearDigits(String s) {
      StringBuilder stack = new StringBuilder();
      
      // Iterate through the string
      for (char c : s.toCharArray()) {
          if (Character.isDigit(c)) {
              // If current character is a digit, remove the last non-digit from the stack
              if (stack.length() > 0) {
                  stack.deleteCharAt(stack.length() - 1);
              }
          } else {
              // Otherwise, push the non-digit character to the stack
              stack.append(c);
          }
      }
      
      // Convert the stack into a string and return it
      return stack.toString();
  }

  public static void main(String[] args) {
    ClearDigit_3174 solution = new ClearDigit_3174();
      
      // Test cases
      System.out.println(solution.clearDigits("abc"));  // Output: "abc"
      System.out.println(solution.clearDigits("cb34")); // Output: ""
  }
}
