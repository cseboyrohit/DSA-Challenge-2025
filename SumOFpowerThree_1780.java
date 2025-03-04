class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {  // If remainder is 2, return false
                return false;
            }
            n /= 3; // Reduce n by dividing by 3
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.checkPowersOfThree(12)); // true (3^1 + 3^2)
        System.out.println(solution.checkPowersOfThree(91)); // true (3^0 + 3^2 + 3^4)
        System.out.println(solution.checkPowersOfThree(21)); // false
    }
}
