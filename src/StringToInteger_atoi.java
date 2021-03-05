/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

Example 1:
Input: s = "42"
Output: 42

Example 3:
Input: s = "4193 with words"
Output: 4193
 */
public class StringToInteger_atoi {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        int i = 0;
        int result = 0;
        int sign = 1;
        //check leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) return 0;
        // check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }
        // read in and convert next the characters until the next non-digit charcter or the end of the input is reached.
        while (i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            int digit = s.charAt(i++) - '0';
            // If the integer is out of the 32-bit signed integer range
            // we clamp the integer so that it remains in the range.
            if (Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }

        return result * sign;

    }
}
