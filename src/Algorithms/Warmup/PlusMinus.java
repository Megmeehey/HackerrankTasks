package Algorithms.Warmup;

import java.util.Scanner;
/**
 * Created by megmeehey on 14.07.17.
 * Task: https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int posit = 0, negat = 0, zeroes = 0;
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(0);
            System.out.println(0);
            System.out.println(0);
            System.exit(0);
        }
        for (int arr_i = 0; arr_i < n; arr_i++) {
            int current = in.nextInt();
            if (current > 0) {
                posit++;
            } else if (current < 0) {
                negat++;
            } else {
                zeroes++;
            }
        }

        System.out.println(((double) posit) / n);
        System.out.println(((double) negat) / n);
        System.out.println(((double) zeroes) / n);
    }
}
