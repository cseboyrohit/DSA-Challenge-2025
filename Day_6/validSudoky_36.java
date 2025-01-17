import java.util.*;

public class validSudoky_36 {
    // Method to validate if the Sudoku board is valid
    public  boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentCell = board[i][j];

                // Skip empty cells
                if (currentCell == '.') continue;

                // Create keys for row, column, and sub-box
                String rowKey = "row" + i + currentCell;
                String colKey = "col" + j + currentCell;
                String boxKey = "box" + (i / 3) + (j / 3) + currentCell;

                // Check if the number has already appeared in the current row, column, or sub-box
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Sample Sudoku board (partially filled)
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '8', '.', '.', '.', '3', '1'},
            {'4', '.', '9', '.', '.', '.', '8', '.', '5'},
            {'7', '.', '.', '.', '6', '.', '.', '.', '9'},
            {'9', '.', '8', '.', '.', '.', '.', '7', '8'},
            {'3', '.', '.', '.', '4', '.', '6', '9', '2'},
            {'1', '9', '2', '.', '.', '6', '4', '8', '7'}
        };

        // Create an object of validSudoky_36
        validSudoky_36 validator = new validSudoky_36();

        // Check if the Sudoku board is valid
        boolean isValid = validator.isValidSudoku(board);
        
        // Output the result
        if (isValid) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is invalid.");
        }
    }
}

