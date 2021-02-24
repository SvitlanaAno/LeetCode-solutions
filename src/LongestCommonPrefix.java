/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        if( strs.length == 1) return strs[0];
        StringBuilder pre = new StringBuilder();

        for(int i = 0; i < strs[0].length(); pre.append(strs[0].charAt(i++))){
            for(int j = 1; j< strs.length; j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
                    return pre.toString();
            }
        }
        return pre.toString();

    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }

}
