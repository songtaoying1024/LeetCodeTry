package Algorithm.easy;

public class maxSubArrayofSizeK {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        if(nums.length==1&&k==1) return nums[0];
        double max = Double.MIN_VALUE;
        for(int i=0,j=k-1;i<n&&j<n;i++,j++){
            int inner = i;
            double res = 0;
            while(inner<=j){
                res+=nums[inner];
                inner++;
            }
            res/=k;
            max = Math.max(res,max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println('c'-'a');
    }
}
