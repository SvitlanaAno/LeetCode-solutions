import java.util.HashMap;

public class SubarraySum {
    /*
    Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

    Example 1:
    Input: nums = [1,1,1], k = 2
    Output: 2

    Example 2:
    Input: nums = [1,2,3], k = 3
    Output: 2

    Technique: Prefix Sums
    Time Complexity: O(n)
    Space Complexity: O(n)

     */
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        int sum = 0, total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for (int cur : nums) {
            sum += cur;
            if (map.containsKey(sum - k))
                total += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return total;
    }
}