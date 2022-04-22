package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    static List<Integer> lst = new ArrayList<>(List.of(0,1));

    public static int fib(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
        {
            return fib(n-1)+fib(n-2);
        }

    }
}
