class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minRecolors = Integer.MAX_VALUE;

        // Try every possible starting position for a k-length window
        for (int i = 0; i <= n - k; i++) {
            int whiteCount = 0;

            // Count the number of 'W' blocks in this k-length substring
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    whiteCount++;
                }
            }

            // Update the minimum recolors needed
            minRecolors = Math.min(minRecolors, whiteCount);
        }

        return minRecolors;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.minimumRecolors("WBBWWBBWBW", 7)); // Output: 3
        System.out.println(sol.minimumRecolors("WBWBBBW", 2));    // Output: 0
        System.out.println(sol.minimumRecolors("WWWWW", 3));      // Output: 3
        System.out.println(sol.minimumRecolors("BBBBB", 4));      // Output: 0
    }
}
