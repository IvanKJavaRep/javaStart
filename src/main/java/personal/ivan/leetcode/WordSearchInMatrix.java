package personal.ivan.leetcode;

public class WordSearchInMatrix {
    public boolean exist(char[][] board, String word) {
        int[] arr = new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        int is = arr[0];
        int js = arr[1];
        int index = 1;
        while (index < word.length()) {
            if (board[is][js + 1] == word.charAt(index)) {
                index += 1;
                js += 1;
                continue;
            } else if (board[is][js - 1] == word.charAt(index)) {
                index += 1;
                js -= 1;
                continue;
            } else if (board[is - 1][js] == word.charAt(index)) {
                index += 1;
                is -= 1;
                continue;
            } else if (board[is + 1][js] == word.charAt(index)) {
                index += 1;
                is += 1;
                continue;
            }
            return true;
        }
        return true;
    }
}
