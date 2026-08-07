class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Arrays to track if a number (1-9) has been seen 
        // in a specific row, column, or 3x3 box.
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // Skip empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                // Convert the char '1'-'9' to a 0-8 index
                int val = board[r][c] - '1';
                
                // Calculate which of the 9 sub-boxes we are currently in
                // This formula maps the (r, c) grid to a 1D array index 0-8
                int boxIndex = (r / 3) * 3 + (c / 3);

                // Check constraints: Have we seen this number already?
                if (rows[r][val] || cols[c][val] || boxes[boxIndex][val]) {
                    return false; // Duplicate found!
                }

                // Mark the number as seen for future checks
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }
        
        // If we make it through the whole board without conflicts, it's valid
        return true;
    }
}