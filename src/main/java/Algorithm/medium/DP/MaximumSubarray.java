package Algorithm.medium.DP;

/**
 *https://www.youtube.com/watch?v=7J5rs56JBs8&t=501s
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * [-2,1,-3,4,-1,2,1,-5,4]
 * [-2,1,-2,4,3,5,6,1,5]
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int n = nums.length;
        int max1=nums[0], max2= nums[0];
        for(int i=1;i<n;i++){
            max2 = Math.max(max2+nums[i],nums[i]);
            max2 = Math.max(max1,max2);
        }
        return max1;
    }

}
