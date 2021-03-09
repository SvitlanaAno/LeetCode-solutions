/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
 */
public class Implement_strStr {
    public int reverse(int x) {
        long result = 0;
        while(x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }

        return (int)result;
    }
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public int strStr2(String haystack, String needle) {
        if(needle.length() < 1 ) return 0;

        int resultIndex = -1;
        int count = 0, index = 0;
        for(int i = 0; i < haystack.length() && index <  needle.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(index)){
                if(count == 0) resultIndex = i;
                index++;
                count++;
            } else if( count > 0){
                index = 0;
                i = i - count ;
                count = 0;
                resultIndex = -1;
            }

        }
        return (index< needle.length()) ?-1: resultIndex;
    }
}
