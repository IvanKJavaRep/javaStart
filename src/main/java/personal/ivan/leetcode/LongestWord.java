package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;
public class LongestWord {

    public static int lengthOfLastWord(String s) {
        String[]  arr = s.split(" ");
        List<String> lst = new LinkedList<>(Arrays.asList(arr));
        List<String> examp = List.of("");
        lst.removeAll(examp);
        return lst.get(lst.size()-1).length();
    }
}

