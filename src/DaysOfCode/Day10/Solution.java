package DaysOfCode.Day10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binaryRepr = Integer.toBinaryString(in.nextInt());
        int maxConsequtive = 0;
        int curConsequtive = 0;
        for (int i = 0; i < binaryRepr.length(); i++) {
            if (binaryRepr.charAt(i) == '1') {
                curConsequtive++;
                if (maxConsequtive < curConsequtive) {
                    maxConsequtive = curConsequtive;
                }
            } else {
                curConsequtive = 0;
            }
        }
        System.out.println(maxConsequtive);
    }
}
