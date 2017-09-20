package DaysOfCode.Day25;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();

            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

        in.close();
    }


    static boolean isPrime(int number) {
        // First, check if number is even, and != 2;
        if (number <= 1) {
            return false;
        }
        if (number > 2 && (number & 1) == 0) {
            return false;
        }
        // If it isn't, checking further
        int boundary = (int) Math.sqrt(number);
        for (int i = 3; i <= boundary; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
