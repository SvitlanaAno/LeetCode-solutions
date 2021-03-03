import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
  https://www.algoexpert.io/questions/Two%20Number%20Sum
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.

  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.

  You can assume that there will be at most one pair of numbers summing up to
  the target sum.

  Example 1:
  Input: nums = [2,7,11,15], target = 9
  Output: [7,2] // the numbers could be in reverse order
 */
public class TwoNumberSum {
    //O(n) time and O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            int key = targetSum - num;
            if (set.contains(key)) {
                return new int[]{key, num};
            } else {
                set.add(num);
            }

        }
        return new int[0];
    }


    //O(nlog(n)) time and O(1) space
    public static int[] twoNumberSum2(int[] array, int targetSum) {

        int left = 0, right = array.length - 1;
        Arrays.sort(array);

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (sum > targetSum) {
                right--;
            } else if (sum < targetSum) {
                left++;
            }
        }
        return new int[0];
    }
}
