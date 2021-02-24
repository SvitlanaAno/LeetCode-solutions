import java.util.Arrays;

public class ZigZag {

    /*
    Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time.
    The converted array should be in form a < b > c < d > e < f.


    Example 1:
    Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
    Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

    Example 2:
    Input: arr[] = {1, 4, 3, 2}
    Output: arr[] = {1, 4, 2, 3}
     */

    // Method for zig-zag conversion of array
    static public void zigZag(int[] arr){

        boolean flag = true;
        int temp = 0;

        for(int i = 0; i < arr.length -2 ; i++){

            if(flag){ // expect a "<"

                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            } else { // expect a ">"
                if(arr[i] < arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }

    }
    public static void main(String[] args)
    {
        int[] array = {0,0,0,0};
        zigZag(array);
         System.out.println(Arrays.toString(array));
    }
}
