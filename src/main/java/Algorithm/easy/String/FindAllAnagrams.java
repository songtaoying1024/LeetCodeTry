package Algorithm.easy.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[26];
        for(int i=0;i<p.length();i++){
            int index = p.charAt(i)-'a';
            arr[index]++;
        }
        for(int i=0;i<s.length()-p.length()+1;i++){
            int index = s.charAt(i)-'a';
            if(arr[index]==0) continue;
            int[] newArr = new int[26];
            for(int j=i;j<i+p.length();j++){
                index = s.charAt(j)-'a';
                newArr[index]++;
            }
            if(Arrays.equals(arr,newArr)) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = new String("abab");
        String s2 = new String("ab");
        new FindAllAnagrams().findAnagrams(s1,s2);
    }
}
