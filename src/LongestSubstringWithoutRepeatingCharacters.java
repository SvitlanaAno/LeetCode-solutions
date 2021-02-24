/*
Given a String, find the longest substring with unique characters. Return the start and end indexes of the substring.

Example 1:
Input: s = "whatwhywhere"
Output: "atwhy"

Example 2:
Input: s = "bbbbb"
Output: "b"

Example 3:
Input: s = ""
Output: null

Constraints:

1 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces
 */

/*
Test Cases:
Edge Cases: empty array, null array
Base Cases: single char, 2 chars (same, different)
Regular Cases: multiple chars (with/without duplicates)
Time Complexity: O(n)
Space Complexity: O(size of character set), which is typically a fixed number, so O(1)
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    public static int lengthOfLongestSubstring(String s){

        // Check empty array, null array
        if(s == null || s.isEmpty()){
            return 0;
        }

        int start = 0, end = 0, longest = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            char toAdd = s.charAt(end);
                if (!set.contains(toAdd)) {
                    set.add(toAdd);
                    end++;
                    longest = Math.max(longest, set.size());
                }
                else {
                    set.remove(s.charAt(start++));
                }
        } return longest;
    }


    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("whatwhywhere"));
    }
}
