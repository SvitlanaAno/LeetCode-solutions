/* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.



Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 */

public class MergeSortedArray {

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = n + m - 1;


        while (m > 0 && end > 0 && n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[end] = nums2[n - 1];
                n--;
                end--;
            } else {
                nums1[end] = nums1[m - 1];
                m--;
                end--;
            }
        }
        while (n > 0) {
            nums1[end] = nums2[n - 1];
            n--;
            end--;
        }
    }
}
