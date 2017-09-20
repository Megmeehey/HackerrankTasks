package DaysOfCode.Day2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip =  tipPercent / 100;
        double tax = taxPercent / 100;
        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        System.out.println((int) Math.round(mealCost * (1 + tip + tax)));
    }
}