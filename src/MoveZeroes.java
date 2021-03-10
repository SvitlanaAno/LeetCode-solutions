/*
https://leetcode.com/problems/move-zeroes/
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeroes {
    //O(n) time and O(1) space
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        if (nums == null) {
            return;
        }
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        while (writeIndex != 0 && writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }
}
