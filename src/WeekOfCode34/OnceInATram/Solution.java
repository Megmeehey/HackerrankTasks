package WeekOfCode34.OnceInATram;

import java.util.*;

public class Solution {

    static String onceInATram(int x) {
        int i = x + 1;
        while (i <= 999999) {
            if (checkDigits(i)) {
                break;
            }
            i++;
        }
        return Integer.toString(i);
    }

    static boolean checkDigits(int x) {
        int[] array = new int[6];
        int i = 0;
        while (i < 6) {
            array[5 - i] = x % 10;
            i++;
            x = x / 10;
        }
        return array[0] + array[1] + array[2] == array[3] + array[4] + array[5];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}