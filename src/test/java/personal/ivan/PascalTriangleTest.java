package personal.ivan;

import org.junit.jupiter.api.Test;

public class PascalTriangleTest {
    @Test void test()
    {
        System.out.println("hello");
        for (var g:PascalTriangle.generate(5)) {
            for (var t:g
            ) {
                System.out.print(t);
            }
            System.out.println("");
        }
    }
}
