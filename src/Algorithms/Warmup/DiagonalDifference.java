package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by megmeehey on 14.07.17.
 * Task: https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(diagDiff(a));
    }

    private static int diagDiff(int[][] matrix) {
        int diff = 0;
        for (int i = 0; i < matrix.length; i++) {
                diff += matrix[i][i] - matrix[matrix.length - i][matrix.length - i];
        }

        return Math.abs(diff);
    }
}
