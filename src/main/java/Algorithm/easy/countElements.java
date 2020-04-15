package Algorithm.easy;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Stack;

public class countElements {
    public int countElements(int[] arr) {
        int len =arr.length;
        if(arr.length<2 || arr==null) return 0;
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<len-1;i++){
            int j =i+1;
            while(arr[i]+1!=arr[j]&&j<len-1) {j++;}
            if(arr[i]+1==arr[j]) count+=1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
