package DaysOfCode.Day7;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            array[i] = in.nextInt();
        }
        in.close();
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}

