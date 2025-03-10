import java.util.*;

class Solution {
    public int countVowelSubstrings(String word, int k) {
        int n = word.length();
        int count = 0;
        
        // Generate all substrings
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            int consonantCount = 0;
            
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                
                // Check if it's a vowel
                if ("aeiou".indexOf(ch) != -1) {
                    vowels.add(ch);
                } else {
                    consonantCount++;
                }
                
                // Check conditions
                if (vowels.size() == 5 && consonantCount == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countVowelSubstrings("aeioqq", 1));  // Output: 0
        System.out.println(sol.countVowelSubstrings("aeiou", 0));   // Output: 1
        System.out.println(sol.countVowelSubstrings("ieaouqqieaouqq", 1)); // Output: 3
    }
}
