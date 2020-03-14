package Algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/***
 * unsolved
 */
public class wordSubsets {
    public List<String> wordSubsets(String[] A, String[] B){
        ArrayList<String> str = new ArrayList<>();
        for(String stra:A){

            Boolean contains = true;
            for(String strb:B) {
                contains=contains&&stra.contains(strb);
            }
            if(contains){
                str.add(stra);
            }
        }
        return str;
    }
}
