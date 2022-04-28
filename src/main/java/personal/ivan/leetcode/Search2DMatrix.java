package personal.ivan.leetcode;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][l - 1] >= target) {
                for (int a : matrix[i]
                ) {
                    if (a == target) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
