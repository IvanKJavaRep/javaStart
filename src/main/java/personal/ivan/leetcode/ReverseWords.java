package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ss = "";
        int ind = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[ind - 1 - i] != "") {
                ss += arr[ind - 1 - i];
                ss += " ";
            }
        }
        ss = ss.trim();
        return ss;
    }
}
