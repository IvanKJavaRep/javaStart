package personal.ivan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Search2DMatrixTest {
    @Test
    void test() {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] arr1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Assertions.assertAll(
                () -> Assertions.assertFalse(Search2DMatrix.searchMatrix(arr1, 13)),
                () -> Assertions.assertTrue(Search2DMatrix.searchMatrix(arr, 3))
        );
    }
}
