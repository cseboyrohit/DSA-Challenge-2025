    int maxScore = 0;
        int leftZeros = 0;  // Count of zeros in the left substring
        int rightOnes = 0;  // Count of ones in the right substring
        
        // Initial count of ones in the right substring (entire string excluding the first character)
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }
        
        // Loop through the string and try each split point
        for (int i = 0; i < s.length() - 1; i++) {  // Ensure both left and right substrings are non-empty
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            
            // Calculate the score at the current split point
            int score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;

----------------------------------------------------------------------------------------------------------------
    //Best approach for leetcode accept
class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int ones = 0; // Count total ones in the string

        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '1')
                ones++;

        int zeros = 0; // Count zeros in the left substring
        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) { // Exclude the last split
            if (s.charAt(i) == '0') 
                zeros++;
            else
                ones--;
            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}
