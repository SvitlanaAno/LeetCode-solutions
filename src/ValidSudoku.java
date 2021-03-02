/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true




 */

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    //O(nm) time || O(nm) space
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    String row = "r" + i + "-" + board[i][j];
                    String column = "c" + j + "-" + board[i][j];
                    String box = "b" + (i / 3 * 3 + j / 3) + "-" + board[i][j]; //box_group = row_length / box_size
                    //box_index = (row / box_size) * box_group + col / box_size

                    if (!set.add(row) || !set.add(column) || !set.add(box)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
