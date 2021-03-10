/*

  https://leetcode.com/problems/squares-of-a-sorted-array/
  Write a function that takes in a non-empty array of integers that are sorted
  in ascending order and returns a new array of the same length with the squares
  of the original integers also sorted in ascending order.
  Example 1:
  Input: nums = [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
  Explanation: After squaring, the array becomes [16,1,0,9,100].
  After sorting, it becomes [0,1,9,16,100].

  Example 2:
  Input: nums = [-7,-3,2,3,11]
  Output: [4,9,9,49,121]
 */
public class SquareSortedArray {
    // O(n) time | O(n) space - where n is the length of the input array
    public int[] sortedSquaredArray(int[] array) {
        int[] squaredArray = new int[array.length];
        int start = 0, end = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (Math.abs(array[start]) > Math.abs(array[end])) {
                squaredArray[i] = array[start] * array[start];
                start++;
            } else {
                squaredArray[i] = array[end] * array[end];
                end--;
            }
        }
        return squaredArray;
    }

    // O(n) time | O(n) space - where n is the length of the input array
    public int[] sortedSquares(int[] nums) {
        int[] powArray = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int index = nums.length - 1;
        while (index >= 0) {
            int sl = nums[l] * nums[l];
            int sr = nums[r] * nums[r];
            if (sl > sr) {
                powArray[index--] = sl;
                l++;
            } else {
                powArray[index--] = sr;
                r--;
            }
        }
        return powArray;
    }
}
