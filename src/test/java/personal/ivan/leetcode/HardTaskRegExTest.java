package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HardTaskRegExTest {
    @Test void test()
    {
        Assertions.assertEquals(true,HardTaskRegEx.isMatch("aa","a"));
        Assertions.assertEquals(false,HardTaskRegEx.isMatch("aa","*"));

    }
    @Test void test1()
    {
        Assertions.assertEquals(false,HardTaskRegEx.isMatch("aa","*"));
    }
}
