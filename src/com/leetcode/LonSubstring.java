package com.leetcode;

class LonSubstring {
  /*
  Returns length of longest common substring
  of X[0..m-1] and Y[0..n-1]
  */
  static int LCSubStr(char X[], char Y[], int m, int n) {
    // Create a table to store
    // lengths of longest common
    // suffixes of substrings.
    // Note that LCSuff[i][j]
    // contains length of longest
    // common suffix of
    // X[0..i-1] and Y[0..j-1].
    // The first row and first
    // column entries have no
    // logical meaning, they are
    // used only for simplicity of program
    int LCStuff[][] = new int[m + 1][n + 1];

    // To store length of the longest
    // common substring
    int result = 0;

    // Following steps build
    // LCSuff[m+1][n+1] in bottom up fashion
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        // create a square matrix and intialize each row and column is incremented by 1
        if (i == 0 || j == 0) {
          LCStuff[i][j] = 0;
        } else if (X[i - 1] == Y[j - 1]) {
          LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
          result = Integer.max(result, LCStuff[i][j]);
        } else {
          LCStuff[i][j] = 0;
        }
      }
    }
    return result;
  }

  static int LCSubStroptimize(String x, String y, int m, int n) {
    int result = 0;
    int[][] LCStuff = new int[m + 1][n + 1];

    for (int i = 0; i < m; i++) {
      char str1 = x.charAt(i);
      for (int j = 0; j < n; j++) {
        if (str1 == y.charAt(j)) {
          LCStuff[i + 1][j + 1] = LCStuff[i][j] + 1;
          result = Math.max(result, LCStuff[i + 1][j + 1]);
        }
      }
    }

    return result;
  }

  // Driver Code
  public static void main(String[] args) {
    String X = "ABCDGH";
    String Y = "ACDGHR";

    int m = X.length();
    int n = Y.length();

    System.out.println("Length of Longest Common Substring is " + LCSubStroptimize(X, Y, m, n));
  }
}

// This code is contributed by Sumit Ghosh
