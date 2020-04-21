package Algorithm.easy;

import java.util.Stack;

/**
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 *
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * Example 1:
 * Input: "()"
 * Output: True
 * Example 2:
 * Input: "(*)"
 * Output: True
 * Example 3:
 * Input: "(*))"
 * Output: True
 * Note:
 * The string size will be in the range [1, 100].
 */

public class validParenthesisWithStar {
    public static boolean checkValidString(String s) {
        int min_op=0,max_op=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') min_op++; else min_op--;
            if(ch!=')') max_op++; else max_op--;
            if(max_op<0) return  false;
            min_op = Math.max(0,min_op);
        }
        return min_op==0;

    }

    public static void main(String[] args) {
       boolean res = checkValidString("((()");
        System.out.println(res);
    }
}
