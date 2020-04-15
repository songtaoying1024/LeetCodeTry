package Algorithm.easy;

public class stringShift {
    public String stringShift(String s, int[][] shift) {
        if(s.length()==0||s.length()==1) return s;
        int rows = shift.length;
        int count = 0;
        for(int i=0;i<rows;i++){
            if(shift[i][0] == 0 ) {count+=shift[i][1];}
            else count -=shift[i][1];
        }
        StringBuffer sb = new StringBuffer(s);
        if(count==0){
            return sb.toString();
        }
        if(count>0){
            while(count>0){
                char a= sb.charAt(0);
                sb.append(a);
                sb.delete(0,1);
                count--;
            }
            return sb.toString();
        }else{
            while(count<0){
                char a = sb.charAt(sb.length()-1);
                sb.insert(0,a);
                sb.setLength(sb.length()-1);
                count++;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String a = "abc";
        int[][] test = new int[][]{{0,1},{1,2}};
        stringShift stringShift = new stringShift();
        String res =stringShift.stringShift(a,test);
        System.out.println(res);
    }
}
