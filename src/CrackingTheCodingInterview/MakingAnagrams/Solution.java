package CrackingTheCodingInterview.MakingAnagrams;

import java.util.Scanner;

public class Solution {
    public static int numberNeeded(String first, String second) {
        int a[] = new int[26];
        int b[] = new int[26];
        int sum = 0;

        for (int i = 0; i < first.length(); i++) {
            a[((int) first.charAt(i)) - 97]++;
        }
        for (int i = 0; i < second.length(); i++) {
            b[((int) second.charAt(i)) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
