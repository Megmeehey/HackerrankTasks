package CrackingTheCodingInterview.RansomNote;

import java.util.Map;
import java.util.Scanner;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        // TODO
        // parse strings by words \\W+
        // put magazine to map
        // check, if each of note in map already
        // if no, break and false.
        // otherwise return true
    }

    public boolean solve() {
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}