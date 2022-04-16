package personal.ivan.leetcode;

public class PolindromeNumber {

    static boolean IsPolindrome(int number) {
        char[] arr = String.valueOf(number).toCharArray();
        int n = arr.length;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                if (!(arr[i] == arr[n - i - 1])) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                if (!(arr[i] == arr[n - i - 1])) {
                    return false;
                }
            }
        }
        return true;

    }
}
