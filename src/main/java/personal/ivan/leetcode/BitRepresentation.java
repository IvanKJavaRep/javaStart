package personal.ivan.leetcode;

public class BitRepresentation {
    public static long reverseBits(int n) {
        String s = Integer.toUnsignedString(n,2);
        String rev  = new StringBuilder(s).reverse().toString();
        return Long.parseLong(rev,2);
    }
}
