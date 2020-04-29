package Algorithm.medium.HashMap;
/**
 * 884. Uncommon Words from Two Sentences
 * Easy
 *
 * 366
 *
 * 80
 *
 * Add to List
 *
 * Share
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Return a list of all uncommon words.
 *
 * You may return the list in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * Example 2:
 *
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 *
 *
 * Note:
 *
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A and B both contain only spaces and lowercase letters.
 * Accepted
 * 49,116
 * Submissions
 * 78,790
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** *
 * https://www.techempower.com/blog/2013/03/26/everything-about-java-8/
 */
public class uncommonWordsfromTwoAentences {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" "))
            count.put(w, count.getOrDefault(w, 0) + 1);
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        return res.toArray(new String[0]);
    }

}
