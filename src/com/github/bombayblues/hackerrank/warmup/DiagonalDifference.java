package com.github.bombayblues.hackerrank.warmup;

import java.util.Scanner;

/**
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.
 * <p>
 * Output Format
 * <p>
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output
 * <p>
 * 15
 * Explanation
 * <p>
 * The primary diagonal is:
 * 11
 * 5
 * -12
 * <p>
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * <p>
 * The secondary diagonal is:
 * 4
 * 5
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 */
public class DiagonalDifference {

    public static void main(final String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        final Scanner stdin = new Scanner(System.in);
        final int n = Integer.parseInt(stdin.nextLine());
        long sumLeftRight = 0;
        long sumRightLeft = 0;
        for (int i = 0; i < n; i++) {
            final String[] elements = stdin.nextLine().split(" ");
            sumLeftRight += Long.parseLong(elements[i]);
            sumRightLeft += Long.parseLong(elements[n - i - 1]);
        }
        System.out.println(Math.abs(sumLeftRight - sumRightLeft));
        stdin.close();
    }
}
