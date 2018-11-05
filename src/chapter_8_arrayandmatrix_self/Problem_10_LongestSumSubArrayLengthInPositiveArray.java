package chapter_8_arrayandmatrix_self;

/**
 * @author Jianghua
 * 2018年11月02日  22：09
 */
public class Problem_10_LongestSumSubArrayLengthInPositiveArray {
    public static int getMaxLength(int[] arr, int k) {
        if(arr == null || arr.length ==0 || k<=0){
            return 0;
        }
        int left = 0;
        int right  = 0;
        int sum = arr[0];
        int len = 0;
        while (right <arr.length){
            if(sum == k){
                len = Math.max(len,right-left+1);
                sum-=arr[left++];
            }else if(sum<k){
                right++;
                if(right==arr.length){
                    break;
                }
                sum += arr[right];
            }else {
                sum -= arr[left++];
            }
        }
        return len;
    }

}











