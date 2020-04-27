package Algorithm.medium.HashSet;

import java.util.HashSet;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 *
 * If there're duplicates in arr, count them seperately.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * Example 2:
 *
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
 * Example 3:
 *
 * Input: arr = [1,3,2,3,5,0]
 * Output: 3
 * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
 * Example 4:
 *
 * Input: arr = [1,1,2,2]
 * Output: 2
 * Explanation: Two 1s are counted cause 2 is in arr.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 1000
 * 0 <= arr[i] <= 1000
 */
public class countingElements {
    public int countElements(int[] arr) {
        // int len =arr.length;
        // if(arr.length<2||arr==null) return 0;
        // Arrays.sort(arr);
        // int count = 0;
        // for(int i=0;i<len-1;i++){
        //     int j=i+1;
        //     while(arr[i]+1!=arr[j]&&j<len-1)j++;
        //     if(arr[i]+1==arr[j]) count+=1;
        // }
        // return count;
        int len =arr.length,count=0;
        if(arr.length<2||arr==null) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++){
            set.add(arr[i]);
        }
        for (int i=0;i<len;i++){
            if(set.contains(arr[i]+1)) count++;
        }
        return count;


    }

}
