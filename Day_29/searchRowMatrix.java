class Solution {
    // Function to search a given number in a row-wise sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            int low = 0, high = m - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (mat[i][mid] == x) {
                    return true;
                } else if (x < mat[i][mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] mat1 = {
            {3, 4, 9},
            {2, 5, 6},
            {9, 25, 27}
        };
        int x1 = 9;

        int[][] mat2 = {
            {19, 22, 27, 38, 55, 67}
        };
        int x2 = 56;

        int[][] mat3 = {
            {1, 2, 9},
            {65, 69, 75}
        };
        int x3 = 91;

        System.out.println("Search 9 in mat1: " + sol.searchRowMatrix(mat1, x1));   // true
        System.out.println("Search 56 in mat2: " + sol.searchRowMatrix(mat2, x2)); // false
        System.out.println("Search 91 in mat3: " + sol.searchRowMatrix(mat3, x3)); // false
    }
}
