package Algorithm.medium;

import java.util.Arrays;

public class SortIntegersByThePowerValue {
    class Power implements Comparable<Power>{
        private int i;
        private int power;
        Power(int i,int power){
            this.i=i;
            this.power=power;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int compareTo(Power p)
        {   if(this.power!=p.power) return this.power - p.power;
            else return this.i-p.i;
        }
    }
    public int getKth(int lo, int hi, int k) {
        Power[] res = new Power[hi-lo+1];
        int i=0;
        while(i<=hi-lo){
            res[i] = new Power(lo+i,power(lo+i));
            i++;
        }
        Arrays.sort(res);
        return res[k-1].getI();
    }
    public int power(int i ){
        int steps =0;
        while(i!=1){
            if(i%2==0){
                i=i/2;
                steps++;
            }else{
                i=i*3+1;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new SortIntegersByThePowerValue().getKth(12,15,2));
    }

}
