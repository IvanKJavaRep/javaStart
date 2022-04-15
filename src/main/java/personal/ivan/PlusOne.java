package personal.ivan;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        for (var g : plusOne(arr)
        ) {
            System.out.println(g);
        }
        ;
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> lst;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int s = 0;
            while (digits[digits.length - 1 - s] == 9) {
                if (digits.length - 1 - s == 0) {
                    int[] arrFinal = new int[digits.length + 1];
                    arrFinal[0] = 1;
                    for (int i = 1; i < arrFinal.length; i++) {
                        arrFinal[i] = 0;
                    }
                    return arrFinal;
                }
                digits[digits.length - 1 - s] = 0;
                s += 1;
            }
            digits[digits.length - 1 - s] += 1;
        }
        return digits;
    }
}
