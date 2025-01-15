public class palidrom {
  public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false; // // Not a palindrome
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {

    // Test cases
    String num1 = "hello";
    String num3 = "00";
    String word = "olo";
    System.out.println(isPalindrome(num1));
    System.out.println(isPalindrome(num3));
    System.out.println(isPalindrome(word));
  }
}
