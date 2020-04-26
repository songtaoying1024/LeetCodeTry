package Algorithm.easy;

import java.util.*;

public class longestPalindrome {
    public int longestPalindrome(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Iterator mapIterator = map.entrySet().iterator();
        int res =0;
        boolean odd =false;
        while(mapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            int curr = ((int) mapElement.getValue());
            if(curr%2==0){
                res+=curr;
            }
            else {
                odd=true;
                res=res+(curr-1);
            }
        }
        if(odd) return res+1;
        else return res;
    }

    /**
     * 这是leetcode的答案用hashset
     * @param s String
     * @return int
     */
    public int longestPalindrome2(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);
    }
    public static void main(String[] args) {
        String s = "cc";
        int res =new longestPalindrome().longestPalindrome(s);
        System.out.println(res);
    }
}
