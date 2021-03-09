public class SquareSortedArray {
    public int[] sortedSquaredArray(int[] array) {
        int[] squaredArray = new int[array.length];
        int start = 0, end = array.length -1;
        for(int i = array.length-1; i >= 0; i--){
            if(Math.abs(array[start])>Math.abs(array[end])){
                squaredArray[i] = array[start]*array[start];
                start++;
            } else {
                squaredArray[i] = array[end]*array[end];
                end--;
            }
        }
        return squaredArray;
    }
}
