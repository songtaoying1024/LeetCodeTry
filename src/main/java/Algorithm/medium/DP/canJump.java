package Algorithm.medium.DP;

public class canJump {
    public boolean canJump(int[] nums) {
        int len = nums.length-1,lastGoodPosition = len;

        for(int i=len;i>=0;i--){
            if(i+nums[i]>=lastGoodPosition) lastGoodPosition=i;
        }
        return lastGoodPosition==0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        boolean res =new canJump().canJump(arr);
        System.out.println(res);

    }
}
