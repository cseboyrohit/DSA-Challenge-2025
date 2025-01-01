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
