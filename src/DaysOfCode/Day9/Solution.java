package DaysOfCode.Day9;

import java.util.Scanner;

public class Solution {
    static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
