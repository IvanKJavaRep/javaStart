package personal.ivan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInArrayIITest {
    @Test void test()
    {
        int[] arr = {2,5,6,0,0,1,2};
        int[] arr1 = {2,5,6,0,0,1,2};
        Assertions.assertTrue(SearchInArrayII.search(arr,0));
        Assertions.assertFalse(SearchInArrayII.search(arr1,3));
    }
}
