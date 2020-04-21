package Algorithm.medium;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class searchInRotatedSortedArray {
    public int solution(int[] nums){
        if (nums==null||nums.length==0) return -1;
        int left = 0, right = nums.length-1;
        while(left < right){
            int midPoint = left + (right- left)/2;
            if(nums[midPoint]>nums[right]){
                left = midPoint+1;
            }else{
                right = midPoint;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,5,6,7,8,9,0,1,2,3};
        System.out.println(new searchInRotatedSortedArray().solution(a));
    }
}
