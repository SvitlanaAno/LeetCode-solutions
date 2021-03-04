import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 */

public class IntersectionOfTwoArraysII {
    // O(n+m) time O(n) space
    public int[] intersect(int[] nums1, int[] nums2) {
        // create map from array with less elements
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                arr.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] output = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            output[i] = arr.get(i);
        }
        return output;
    }

    // Follow up: What if the given array is already sorted? How would you optimize your algorithm?
    //  O(nlog(n) + m(Log(m))) time (sorting time)  and O(1) space(if returned array doesn't count)
    public int[] intersectSorted(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }
        int[] ret = new int[list.size()];
        for (int k = 0; k < list.size(); k++) ret[k] = list.get(k);
        return ret;
    }
}
