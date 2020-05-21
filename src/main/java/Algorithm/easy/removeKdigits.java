package Algorithm.easy;

import java.util.HashSet;
import java.util.Set;

public class removeKdigits {
    public String removeKdigits(String num, int k) {
        if(num == null || num.length()==0) return null;
        Set<Integer> set = new HashSet<>();

        for(int i=0,j=0;(i<num.length()-1)&&j<k;i++){
            int prev = num.charAt(i)-'0';
            int post = num.charAt(i+1)-'0';
            if(prev>=post)
            {
                set.add(i);
                j++;
            }
            else continue;
        }
        char[] arr2 = num.toCharArray();
        StringBuffer res = new StringBuffer();
        for(int i=0;i<arr2.length;i++){
            if(!set.contains(i)) res.append(arr2[i]);
        }
        while(res.charAt(0)=='0'&&res.length()>0){
            res.deleteCharAt(0);
        }
        return res.toString();

    }
    enum level {
         Push,
         Pull,
    }

    public static void main(String[] args) {
        System.out.println(level.Pull.toString());

    }
}
