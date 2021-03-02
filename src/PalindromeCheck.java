
/*

Write a function that takes in a non-empty string and that returns a boolean representing whether the string is a palindrome.
A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.

Example :
Input: s = " = "abcdcba"
Output: true
Explanation: it's written the same forward and backward.
 */

public class PalindromeCheck {

    //O(n) time || O(1) space
    public static boolean isPalindrome(String str) {
        if (str.length() == 1) return true;

        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        // Write your code here.
        return true;
    }
}
