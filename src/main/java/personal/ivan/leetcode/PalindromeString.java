package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PalindromeString {
    public static  boolean isPalindrome(String s) {
        String newS = s.toLowerCase(Locale.ROOT);
        List<Character> lst = new ArrayList<>();
        for (int i = 0; i < newS.length(); i++) {
            if((newS.charAt(i)>=97 && newS.charAt(i)<123) || (newS.charAt(i)>47 && newS.charAt(i)<58))
            {
                lst.add(newS.charAt(i));
            }
        }
        int ss=0;
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i)!=lst.get(lst.size()-i-1))
            {
                ss+=1;
            }
        }
        if(ss==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
