package Algorithm.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class addTwoNumbers {
    public addTwoNumbers() {
    }

    public LinkedList<Integer> addTwoNumbers (LinkedList<Integer> l1, LinkedList<Integer>l2){


          Integer arrayL1[] = l1.toArray(new Integer[l1.size()]);
          Integer arrayL2[] = l2.toArray(new Integer[l2.size()]);
          int l1sum =0, l2sum=0;
        for(int i=arrayL1.length-1;i>=0;i--) {
            l1sum += (arrayL1[i] * Math.pow(10, i));
        }
        for(int j=arrayL2.length-1;j>=0;j--) {
            l2sum += (arrayL2[j] * Math.pow(10, j));
        }
        int sum = l1sum+l2sum;
        System.out.println(l1sum);
        System.out.println(l2sum);
        System.out.println(sum);
        int [] sumArray=digitizeNumber(sum);
        LinkedList<Integer> l = convertArrayToLinkedList(sumArray);
        return l;

    }
    public int[] digitizeNumber (int num){
        String s = String.valueOf(num);
        String r = new StringBuffer(s).reverse().toString();
        String[] stringArray = r.split("");

        Integer[] array = Arrays.stream(stringArray).map(Integer::valueOf).toArray(Integer[]::new);
        int[] returnArray = new int[array.length];

        for(int i=0;i<array.length;i++){
            returnArray[i] = array[i].intValue();
        }
        return returnArray;
    }
    public LinkedList<Integer> convertArrayToLinkedList (int[] al){
        LinkedList<Integer> l = new LinkedList<>();
        for(Integer t : al){
            l.add(t);
        }
        return l;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        addTwoNumbers addTwoNumbers = new addTwoNumbers();
        LinkedList result = addTwoNumbers.addTwoNumbers(l1,l2);
        System.out.println(result);
    }
}
