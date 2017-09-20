package DaysOfCode.Day5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        for (int i = 1; i < 11; i++) {
            sb.append(n).append(" x ").append(i).append(" = ").append(n*i);
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
