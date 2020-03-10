package Algorithm.easy;

import java.util.Stack;

public class longestCommonPrefix {


    public static String longestCommonPrefix (String[] strs){
        if(strs ==null || strs.length ==0 ) return "";
        String pre = strs[0];
        int i = 1;
        while(i<strs.length){
            while(strs[i].indexOf(pre)!=0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strings = {"abc" , "abcd","abcdev"};
        Stack<Character> stack = new Stack<Character>();
        Character a =stack.push(')');
        System.out.println(stack.pop());
    }

}
