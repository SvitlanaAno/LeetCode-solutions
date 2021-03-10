/*
https://leetcode.com/problems/reverse-string/
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.

Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    //O(n) time and O(1) space
    public void reverseString(char[] s) {
        if(s == null || s.length < 2) return;
        int endPos = s.length - 1;
        for(int i  = 0; i < endPos ; i++, endPos-- ){
            char temp = s[i];
            s[i] = s[endPos];
            s[endPos] = temp;
        }
    }

}
