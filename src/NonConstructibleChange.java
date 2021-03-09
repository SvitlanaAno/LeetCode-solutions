import java.util.Arrays;

/*
https://www.algoexpert.io/questions/Non-Constructible%20Change
Given an array of positive integers (representing coins), find the smallest value that cannot be constructed from those integers.
Example 1:
Input: A = [1, 2, 4]
Output: 8

Explanation: With subsets of A, we can construct values 1, 2, 3, 4, 5, 6, 7.

Example 2:
Input: A = [1, 2, 5]
Output: 4
Explanation: With subsets of A, we can construct values 1, 2, 3, 5, 6, 7, 8
 */
public class NonConstructibleChange {
    // O(nlog(n) time and O(1) space
    public int nonConstructibleChange(int[] coins) {
        int change = 0;
        Arrays.sort(coins);
        for(int coin: coins ){
            if(coin <= change + 1){
                change += coin;
            } else {
                return change + 1;
            }
        }
        return change + 1;
    }
}
