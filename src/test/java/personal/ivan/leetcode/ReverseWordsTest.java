package personal.ivan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsTest {
    @Test void test()
    {
        String  s = "  hello world  ";
        Assertions.assertEquals( "world hello",ReverseWords.reverseWords(s));
    }
}
