/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false
 */


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dist = new HashSet<>();
        for (int num : nums) {
            if (!dist.add(num)) return true;
        }
        return false;
    }
}
