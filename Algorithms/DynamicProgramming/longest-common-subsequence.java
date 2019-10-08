// https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the longestCommonSubsequence function below.
    static int[] longestCommonSubsequence(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;

        int[][] L = new int[aLength + 1][bLength + 1];
        for (int i = 0; i <= aLength; i++) {
            for (int j = 0; j <= bLength; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (a[i-1] == b[j-1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                }
            }
        }

        // length of LCS
        int index = L[aLength][bLength];
        int temp = index;

        int[] lcs = new int[index];

        // reverse matrix L starting from bottom-right corner
        // find each match, and prepend to lcs[]
        int i = aLength;
        int j = bLength;

        while (i > 0 && j > 0) {
            if (a[i-1] == b[j-1]) {
                // incude char
                lcs[index-1] = a[i-1];

                // decrement
                i--;
                j--;
                index--;
            } else if (L[i-1][j] > L[i][j-1]) {
                // find larger of the two and go in that direction
                i--;
            } else {
                j--;
            }
        }

        return lcs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = longestCommonSubsequence(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
