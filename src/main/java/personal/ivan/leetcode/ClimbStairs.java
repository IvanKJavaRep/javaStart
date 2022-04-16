package personal.ivan.leetcode;

public class ClimbStairs {
    public static int s = 0;

    public static int climbStairs(int n) {
        int[] number = new int[n+1];
        number[0]=1;
        number[1]=1;
        for (int i = 2; i < n+1; i++) {
            number[i]=number[i-1]+number[i-2];
        }
        return number[n];
    }

    public static void RecurCount(int curr, int n) {
        if (curr == n) {
            s += 1;
        } else {
            if (curr + 2 <= n) {
                RecurCount(curr + 2, n);
            }
            if (curr + 1 <= n) {
                RecurCount(curr + 1, n);
            }
        }
    }
}
