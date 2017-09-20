package DaysOfCode.Day6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String current = in.next();
            even.setLength(0);
            odd.setLength(0);
            for (int j = 0; j < current.length(); j++) {
                if (j % 2 == 0) {
                    even.append(current.charAt(j));
                } else {
                    odd.append(current.charAt(j));
                }
            }
            even.append(" ").append(odd);
            System.out.println(even);
        }
    }
}
