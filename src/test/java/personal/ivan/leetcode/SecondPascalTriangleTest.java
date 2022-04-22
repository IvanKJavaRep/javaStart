package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SecondPascalTriangleTest {
    @Test void test()
    {
        List<Integer> lst = SecondPascalTriangle.getRow(3);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

    }
}
