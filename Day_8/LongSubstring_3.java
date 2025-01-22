import java.util.HashSet;
import java.util.Set;

public class LongSubstring_3 {
    public static int longSubstingRepChar(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // If the character is already in the set, remove characters from the left
            while (set.contains(ch)) {
                set.remove(s.charAt(left)); // Remove the character at the left pointer
                left++;
            }

            // Add the current character to the set
            set.add(ch);
            
            // Update the max length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(longSubstingRepChar(s1)); // Should return 3 ("abc")
        System.out.println(longSubstingRepChar(s2)); // Should return 1 ("b")
        System.out.println(longSubstingRepChar(s3)); // Should return 3 ("wke")
    }
}
