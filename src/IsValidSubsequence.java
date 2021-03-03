/*
  https://www.algoexpert.io/questions/Validate%20Subsequence
  Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For instance, the numbers [1, 3, 4]
  form a subsequence of the array [1, 2, 3, 4] , and so do the numbers [2, 4]. Note that a single number in an array
  and the array itself are both valid subsequences of the array.

  Sample Input
  array = [5, 1, 22, 25, 6, -1, 8, 10]
  sequence = [1, 6, -1, 10]

  Sample Output
  true
 */

import java.util.List;

public class IsValidSubsequence {
    //O(n) time and O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size()) return false;

        int indexArray = 0, indexSequence = 0;
        while (indexSequence < sequence.size()) {
            while (indexArray < array.size() && sequence.get(indexSequence) != array.get(indexArray)) {
                indexArray++;
            }
            if (indexArray >= array.size()) {
                return false;
            } else if (array.get(indexArray) == sequence.get(indexSequence)) {
                indexArray++;
                indexSequence++;
            }
        }

        return (indexSequence >= sequence.size()) ? true : false;
    }
}
