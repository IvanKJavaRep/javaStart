import java.util.*;

import static java.lang.System.*;

public class SubstringTask {
    public static void main(String[] args) {
        //out.println(FindSubstring("dvdf"));
        out.println(longestUniqueSubsttr("abcdaaefghij"));
    }
    public static int longestUniqueSubsttr(String str)
    {
        String test = "";

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
                out.println(test);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }


    static int FindSubstring(String s) {
        char[] arr = s.toCharArray();
        char[] test;
        //out.println(arr.length);
        int maxs=0;
        Set<Character> setS = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                //out.println(s.substring(i,j+1));
                test = s.substring(i,j+1).toCharArray();
                for (char c : test
                ) {
                    setS.add(c);
                }
                //out.println(setS.size());
                if(setS.size()>maxs && setS.size()==test.length)
                    maxs=setS.size();
                setS.clear();
                if(maxs==s.length())
                    break;
            }
        }
        return maxs;



    }
}
