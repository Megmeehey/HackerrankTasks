package DaysOfCode.Day1;

import java.util.Scanner;

/**
 * Day 1: Data Types.
 */
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        i += scan.nextInt();
        d += scan.nextDouble();
        scan.nextLine();
        s += scan.nextLine();

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        scan.close();
    }
}