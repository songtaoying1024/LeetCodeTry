package Algorithm.medium;

/**
 * 1395. Count Number of Teams
 * Medium
 *
 * 174
 *
 * 49
 *
 * Add to List
 *
 * Share
 * There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
 *
 * You have to form a team of 3 soldiers amongst them under the following rules:
 *
 * Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
 * A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
 * Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
 *
 *
 *
 * Example 1:
 *
 * Input: rating = [2,5,3,4,1]
 * Output: 3
 * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
 * Example 2:
 *
 * Input: rating = [2,1,3]
 * Output: 0
 * Explanation: We can't form any team given the conditions.
 * Example 3:
 *
 * Input: rating = [1,2,3,4]
 * Output: 4
 */
public class countNumberOfTeams {

    /**
     * 解释，关键是找到中间的点，然后左右情况相乘
     * The ides of this solution is to fix the middle one(pivot) and count the left ones which are less/greater than the pivot. After that we can update the combination with left * right.
     *
     * Example:
     * rating = [2,1,3,4,7,6,8]
     *
     * when pivot = 4, less = [3, 3], then we can count the total combination of (x, 4, x) is 9 in ascending order.
     * On the other hand, greater[0, 0] will represent the descending order but in this case the total combination of this order is 0.
     * @param rating
     * @return
     */
    public int numTeams(int[] rating) {
        int res = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            int[] less = new int[2], greater = new int[2];
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    less[0]++;
                } else {
                    greater[0]++;
                }
            }

            for (int k = i + 1; k < rating.length; k++) {
                if (rating[i] < rating[k]) {
                    less[1]++;
                } else {
                    greater[1]++;
                }
            }
            res += less[0] * less[1] + greater[0] * greater[1];
        }
        return res;
    }
}
