class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // To store the count of 'a', 'b', 'c'
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++; // Increase count for current character

            // When all three characters are present, shrink window from left
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += (s.length() - right); // All substrings from left to right are valid
                count[s.charAt(left) - 'a']--; // Remove leftmost character
                left++; // Move left pointer forward
            }
        }
        return result;
    }
}
