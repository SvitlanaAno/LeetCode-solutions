/*

   https://leetcode.com/problems/minimum-size-subarray-sum/
   Given an array of positive integers nums and a positive integer target, return the minimal length of a
   contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
   If there is no such subarray, return 0 instead.

   Example 1:
   Input: target = 7, nums = [2,3,1,2,4,3]

   Output: 2
   Explanation: The subarray [4,3] has the minimal length under the problem constraint.

   Example 2:
   Input: target = 4, nums = [1,4,4]
   Output: 1
 */
public class MinimumSizeSubarraySum {
    // O(n) and O(1) space
    public int minSubArrayLen(int s, int[] nums) {
        int minWindowSize = Integer.MAX_VALUE, startWindow = 0;
        int sumArray = 0;

        for (int endWindow = 0; endWindow < nums.length; endWindow++) {
            sumArray += nums[endWindow];

            while (sumArray >= s) {
                minWindowSize = Math.min(minWindowSize, endWindow - startWindow + 1);
                sumArray -= nums[startWindow++];
            }
        }
        return (minWindowSize == Integer.MAX_VALUE) ? 0 : minWindowSize;

    }
}
