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
            if(lst.size()==n) {
                lst.add(lst.get(n - 1) + lst.get(n - 2));
                return lst.get(n);
            }
            else if(lst.size()>n)
            {
                return lst.get(n);
            }
            else
            {
                return fib(n-1)+fib(n-2);
            }
        }

    }
}
