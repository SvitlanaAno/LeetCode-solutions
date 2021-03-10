/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value
to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            int rem = x%10;
            int newResult = result*10 + rem;
            if((newResult - rem)/10 != result) return 0;
            result = newResult;
            x= x/10;
        }
        return result;
    }


    public int reverse2(int x) {
        int result = 0;
        boolean signPos = (x > 0)? true: false;
        x = Math.abs(x);
        while (x != 0){
            int rem = x%10;
            if(result > (Integer.MAX_VALUE - rem)/10)return 0;
            result = result*10 + rem;
            x= x/10;
        }
        return (signPos)?result: -result;
    }
}
