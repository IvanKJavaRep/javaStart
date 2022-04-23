package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HardTaskRegEx {
    public static void main(String[] args) {
        System.out.println(isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb"
                , "*"));
    }
    public static boolean isMatch(String s, String p) {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        List<Character> lstofstars = new ArrayList<>();
        List<Character> lstOfChars = new ArrayList<>();
        p = p.replace("*", ".*");
        p = p.replace("?", ".");
        String h = p;
        boolean f = true;
        while (f) {
            p = p.replace(".*.*", ".*");
            if (h == p) {
                f = false;
            } else {
                h = p;
            }
        }
        Pattern pattern = Pattern.compile(p);
        //System.out.println(pattern);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
