/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]

 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //rotate matrix rows
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
        // switch rows on colums
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }


    public void rotate2(int[][] matrix) {

        int n = matrix.length -1;

        for (int i = 0; i < matrix.length/ 2; i++)
            //matrix.length/2 count of all the cycles, in  each iteration, we are working on 2 rows, so we
            // iterate from 0 to matrix.length/2 and not till matrix.length.
            for (int j = i; j < n - i; j++) {
                //four moves are done each time the inner for is executed
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = tmp;
            }
    }
}
