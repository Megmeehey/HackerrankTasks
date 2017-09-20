package DaysOfCode.Day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        try {
            Integer.parseInt(s);
        }
        catch (Exception e) {
            System.out.println("Bad String");
            return;
        }
        System.out.println(s);
    }
}