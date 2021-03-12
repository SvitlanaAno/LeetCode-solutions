/*
You are given a string that represents time in the format hh:mm. Some of the digits are blank
(represented by ?). Fill in ? such that the time represented by this string is the maximum possible.
Maximum time: 23:59, minimum time: 00:00. You can assume that input string is always valid.

Example 1:
Input: "?4:5?"
Output: "14:59"
Example 2:

Input: "23:5?"
Output: "23:59"

 */
public class MaximumTime {
    public static void giveMeMaxTime(String tim) {
        char[] time = tim.toCharArray();

        if (time[0] == '?')
            time[0] = (time[1] <= '3' || time[1] == '?') ? '2' : '1';

        if (time[1] == '?')
            time[1] = (time[0] == '2') ? '3' : '9';

        time[3] = (time[3] == '?') ? '5' : time[3];
        time[4] = (time[4] == '?') ? '9' : time[4];

        System.out.println(time);

    }

}
