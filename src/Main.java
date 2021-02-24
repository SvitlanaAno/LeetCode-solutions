
public class Main {


   static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = n+m -1;


        while(m > 0 && end > 0 && n >0){
            if(nums2[n-1] > nums1[m-1]){
                nums1[end] = nums2[n-1];
                n--;
                end--;
            } else {
                nums1[end] = nums1[m-1];
                m--;
                end--;
            }
        }
        while(n > 0){
            nums1[end] = nums2[n-1];
            n--;
            end--;
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{0, 5,6} , 3);
        System.out.println();
        System.out.println("Hello World!");
    }
}
