package Algorithm.easy;

import java.util.Arrays;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        if(nums.length==1||nums==null) return;
        for(int i=0,j=1;i<nums.length-1&&j<nums.length;i++,j++){
            if(nums[i]!=0) continue;
            while(nums[i]==0&&nums[j]==0&&j<nums.length-1) j++;
            if(nums[i]==0&&nums[j]!=0){
                int swap = nums[j];
                nums[j] = nums[i];
                nums[i] = swap;
            }
        }
        return ;

    }

    public static void main(String[] args) {
        String s ="qfasdf";
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String keystr = String.valueOf(ca);
        System.out.println(keystr);
        System.out.println(ca);
    }
}
