class Solution {
    public long coloredCells(int n) {
        return 1L + 2L * (n - 1) * n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coloredCells(1)); // Output: 1
        System.out.println(solution.coloredCells(2)); // Output: 5
        System.out.println(solution.coloredCells(3)); // Output: 13
        System.out.println(solution.coloredCells(4)); // Output: 25
        System.out.println(solution.coloredCells(5)); // Output: 41
    }
}
