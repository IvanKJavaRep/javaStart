package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test void test()
    {
        MinStack mst = new MinStack();
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin();
    }
}
