public class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing spaces m
        s = s.trim();
        
        // Find the index of the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        //' The length of the last word is the difference between the total length and the position of the last space
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        
        // Test case 2
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
    }
}
