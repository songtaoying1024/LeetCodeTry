package Algorithm.medium;

import java.util.List;

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
    public int solution(int[] nums,int target){
        int left = 0, right =nums.length-1,result=-1;
        while(left <= right){
            int midPoint = left + (right-left)/2;
            if(nums[midPoint] == target) {
                result=midPoint;
                right=midPoint-1;
            }
            else if(nums[midPoint] < target){
                left = midPoint+1;
            }else{
                right = midPoint -1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,1,1,1,1};
        System.out.println(new searchInRotatedSortedArray().solution(a,1));
    }
}
