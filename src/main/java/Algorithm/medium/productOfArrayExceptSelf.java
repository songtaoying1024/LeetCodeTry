package Algorithm.medium;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[0] =1;
        for(int i=1;i<n;i++){
            res[i] =res[i-1]*nums[i];
        }
        int right =1;
        for(int i=n-1;i>=0; i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{1, 2, 3, 3};
        if (arr.equals(arr1)) {
            System.out.println("this is true");
        } else {
            ;
            System.out.println("this is not true");
        }
    }
}
