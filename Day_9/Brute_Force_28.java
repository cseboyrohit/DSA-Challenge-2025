 public class Brute_Force_28 {
  public static int strStr(String haystack, String needle){
      int n=haystack.length();
      int m=needle.length();
      if(m==0) return 0;
      for(int i=0; i<n-m; i++){
          if(haystack.substring(i,i+m).equals(needle)){
              return i;
          }
      }
      return -1;
  }

  public static void main(String[] args) {
    String haystack1 = "hello";
    String needle1 = "ll";
    System.out.println("Result: " + strStr(haystack1, needle1));  // Output should be 2

    String haystack2 = "aaaaa";
    String needle2 = "bba";
    System.out.println("Result: " + strStr(haystack2, needle2));  // Output should be -1

    String haystack3 = "hello";
    String needle3 = "";
    System.out.println("Result: " + strStr(haystack3, needle3));  // Output should be 0 (since needle is empty)
  }
}
