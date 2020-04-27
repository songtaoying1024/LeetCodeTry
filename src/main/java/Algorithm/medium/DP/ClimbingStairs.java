package Algorithm.medium.DP;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * Accepted
 * 620,544
 * Submissions
 * 1,333,643
 *
 * /////////  my thoughts ////////
 * Dynamic programming
 *
 * Since everytime it can jump 1 or 2 steps the options to reach point n is the sum
 * of the options to reach point n-1 and point n-2
 * 每次能跳1 或者2步，那么跳到n的可能的方式 等于跳到n-1 和 n-2 方式的和。
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        //出口
        if(n<=0) return 0;
        if(n==1) return 1;
        int[] arr = new int[n];
        arr[0]=1;arr[1]=2;
        for(int i=2;i<n;i++){
            /** 子问题 */
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
