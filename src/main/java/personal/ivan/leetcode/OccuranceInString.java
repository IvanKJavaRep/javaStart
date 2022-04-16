package personal.ivan.leetcode;

public class OccuranceInString {

    public static int strStr(String haystack, String needle)
    {
        if(haystack.length()==0)
            return 0;
        else if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return  -1;

    }
}
