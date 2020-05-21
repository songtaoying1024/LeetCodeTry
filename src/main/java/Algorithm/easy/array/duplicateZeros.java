package Algorithm.easy.array;

/**
 * int countZero = 0;
 *         for (int i = 0; i < arr.length; i++) {
 *             if (arr[i] == 0) countZero++;
 *         }
 *         int len = arr.length + countZero;
 *         //We just need O(1) space if we scan from back
 *         //i point to the original array, j point to the new location
 *         for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
 *             if (arr[i] != 0) {
 *                 if (j < arr.length) arr[j] = arr[i];
 *             } else {
 *                 if (j < arr.length) arr[j] = arr[i];
 *                 j--;
 *                 if (j < arr.length) arr[j] = arr[i]; //copy twice when hit '0'
 *             }
 *         }
 *         in place 代表了不能去创造新的array
 */
public class duplicateZeros {

    public void duplicateZeros(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
        }
        int len = arr.length + countZero;
        //We just need O(1) space if we scan from back
        //i point to the original array, j point to the new location
        for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            if (arr[i] != 0) {
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
                j--;
                if (j < arr.length) arr[j] = arr[i]; //copy twice when hit '0'
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(true^false);
    }
}
