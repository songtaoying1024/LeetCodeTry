package Algorithm.easy;

/**
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
 *
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 *
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 */
public class RotateString {

    public boolean rotateString(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if(lenA==0&&lenB==0) return true;
        if(lenA != lenB) return false;
        String curr = B;
        for(int i=0;i<lenA-1;i++){
            curr = modifyString(curr);
            if(A.equals(curr)) return true;
        }
        return false;
    }
    public String modifyString(String B){
        StringBuffer BBuffer = new StringBuffer(B);
        char lastChar = BBuffer.charAt(BBuffer.length()-1);
        BBuffer.setLength(BBuffer.length()-1);
        BBuffer.insert(0,lastChar);
        return BBuffer.toString();
    }
    public boolean solutionInLeetCodeDiscuss(String A, String B){
        return (A.length()==B.length())&&(A+A).contains(B);
    }
}
