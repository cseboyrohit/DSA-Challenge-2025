// Optimized Sliding Window
public class Implement_strStr_28 {
public static int strStr(String str1, String str2){
    int n=str1.length();
    int m=str2.length();
    if(m==0) return 0;
    for(int i=0; i<n-m; i++){
      int right=0;
      while(right < m && str1.charAt(right + i) == str2.charAt(i)){
      right++;
      }
      if(right == m) return i;
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
    System.out.println("Result: " + strStr(haystack3, needle3)); 
}
}
