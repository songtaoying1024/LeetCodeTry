package Algorithm.easy;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */
public class replaceElementswithGreatestElementOnRightSide {
    public int[] replaceElements(int[] A) {
        int mx = -1, n = A.length, a;
        for (int i = n - 1; i >= 0; --i) {
            a = A[i];
            A[i] = mx;
            mx = Math.max(mx, a);
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[]{17,18,5,4,6,1};
        replaceElementswithGreatestElementOnRightSide ha = new replaceElementswithGreatestElementOnRightSide();
        System.out.println(ha.replaceElements(A));
    }
}
