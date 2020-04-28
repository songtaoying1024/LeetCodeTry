package Algorithm.medium.Stack;

import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {

        Stack<Character> Sstack = new Stack();
        Stack<Character> Tstack = new Stack();
        return changeStack(S,Sstack).equals(changeStack(T,Tstack));

    }
    public Stack<Character> changeStack (String S, Stack<Character> stack){
        for(int i=0;i<S.length();i++){
            char schar =S.charAt(i);
            if(schar!= '#'){
                stack.add(schar);
            }
            if(schar=='#'&&!stack.empty()){
                stack.pop();
            }
        }
        return stack;
    }
}
