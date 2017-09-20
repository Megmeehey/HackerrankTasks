package CrackingTheCodingInterview.LeftRotation;

import java.util.Scanner;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        k = k % n;
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = a[i];
        }
        int i = 0;
        for (i = 0; i < a.length - k; i++) {
            a[i] = a[i + k];
        }
        for (; i < a.length; i++) {
            a[i] = tmp[i + k - a.length];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}