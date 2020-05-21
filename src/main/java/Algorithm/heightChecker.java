package Algorithm;

import java.util.Arrays;

public class heightChecker{

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int heightChecker(int[] heights) {
        if(heights==null || heights.length==0) {return 0;}
        int[] cp = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            cp[i] =heights[i];
        }
        int count = 0;
        Arrays.sort(cp);
        for(int i=0;i<heights.length;i++){
            if(cp[i]!=heights[i]) {count++;}
        }
        return count;

    }

    public static void main(String[] args) {
        int[] curr = new int[]{1,1,4,2,1,3};
        new heightChecker().heightChecker(curr);
    }
}
