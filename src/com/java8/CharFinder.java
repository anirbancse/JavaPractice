package com.java8;

public class CharFinder {

    public static boolean exist(char[][] board, String word) {

        System.out.println(board.length);

        int[][] visited = new int[board.length][board[0].length]; // required for keeping track of visited

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.println("check");
                if (board[r][c] == word.charAt(0)) { // if first char of WORD matches board[r][c] so start checking for
                                                     // possible ans

                    if (dfs(r, c, word, board, visited, 0))
                        return true;

                }
            }
        }
        return false;
    }

    public static boolean dfs(int r, int c, String word, char[][] board, int[][] visited, int i) {
        System.out.println("row no: " + r + "\ncol no: " + c + "\nword: " + word + "\nboard[][] " + board
                + "\nvisited: " + visited + "\ni: " + i + "\n\n");

        if (word.length() == i) {

            return true;

        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || visited[r][c] == 1
                || board[r][c] != word.charAt(i)) { // if got out of bound condition
            return false;
        }

        visited[r][c] = 1; // marking visited

        // dxns to check

        boolean res = dfs(r + 1, c, word, board, visited, i + 1) || // down

                dfs(r, c + 1, word, board, visited, i + 1) || // right

                dfs(r - 1, c, word, board, visited, i + 1) || // up

                dfs(r, c - 1, word, board, visited, i + 1); // left

        // undoing changes made so dont create problem for future cases

        return res;
    }

    public static void main(String[] args) {

        char[][] c = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String s = "ABCCED";
        System.out.println(exist(c, s));

        // for(int i=0;i<c.length+1;i++){
        // for(int j=0;j<c.length;j++){
        // if(s.charAt(k)==c[j][i]){
        // check = check.concat(String.valueOf(c[j][i]));
        // k++;
        // }else if()
        // }
        // }
        // System.out.println(check);
        // if(check.equalsIgnoreCase(s))
        // System.out.println(true);
        // else
        // System.out.println(false);
    }
}
