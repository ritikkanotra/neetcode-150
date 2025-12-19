class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();
        // Rule 1
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = Character.getNumericValue(board[i][j]);
                if (num < 1 || num > 9 || set.contains(num)) {
                    System.out.println("Rule 1 " + num);
                    return false;
                }
                set.add(num);
            }
            set.clear();
        }
        // Rule 2
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                int num = Character.getNumericValue(board[j][i]);
                if (num < 1 || num > 9 || set.contains(num)) {
                    System.out.println("Rule 2");
                    return false;
                }
                set.add(num);
            }
            set.clear();
        }
        // Rule 3
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        if (board[i + c][j + d] == '.') continue;
                        int num = Character.getNumericValue(board[i + c][j + d]);
                        if (set.contains(num)) {
                            System.out.println("Rule 3");
                            return false;
                        }
                        set.add(num);
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}