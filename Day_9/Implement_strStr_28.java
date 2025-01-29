// Optimized Sliding Window
public class Implement_strStr_28 {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length(); // Length of the haystack string.
        int m = needle.length(); // Length of the needle string.

        // If the needle is an empty string, return 0 as per problem definition.
        if (m == 0) return 0;

        // Loop through the haystack string.
        for (int i = 0; i <= n - m; i++) {
            int j = 0; // Initialize a pointer for needle.

            // Check if substring of haystack matches needle.
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++; // Increment j if characters match.
            }

            // If j equals the length of needle, it means we've found the match.
            if (j == m) return i; // Return the starting index of the match.
        }

        // If no match is found, return -1.
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
