package Algorithm.medium;

import java.util.*;

public class generateParenthesis {
    public List<String> generateParenthesis(int n){
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;

    }

    public void backtrack(List<String> list, String str, int open, int close, int max){
        int sum = open+close;
        System.out.println("time of recursive: "+ sum + " open: "+ open + " close: "+ close);
        if(str.length() == max*2){
            list.add(str);
            System.out.println(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }

    public static void main(String[] args) {
        generateParenthesis a = new generateParenthesis();
        System.out.println(a.generateParenthesis(3));
        Set<Integer> set  = new HashSet<>();
        Iterator value = set.iterator();
        int haha = (int) value.next();
    }
}
