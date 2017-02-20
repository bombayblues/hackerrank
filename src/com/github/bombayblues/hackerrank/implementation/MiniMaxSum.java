package com.github.bombayblues.hackerrank.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * <p>
 * Input Format
 * <p>
 * A single line of five space-separated integers.
 * <p>
 * Constraints
 * <p>
 * Each integer is in the inclusive range .
 * Output Format
 * <p>
 * Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
 * <p>
 * Sample Input
 * <p>
 * 1 2 3 4 5
 * Sample Output
 * <p>
 * 10 14
 * Explanation
 * <p>
 * Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:
 * <p>
 * If we sum everything except , our sum is .
 * If we sum everything except , our sum is .
 * If we sum everything except , our sum is .
 * If we sum everything except , our sum is .
 * If we sum everything except , our sum is .
 * As you can see, the minimal sum is  and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.
 * <p>
 * Hints: Beware of integer overflow! Use 64-bit Integer.
 */
public class MiniMaxSum {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final long a = in.nextLong();
        final long b = in.nextLong();
        final long c = in.nextLong();
        final long d = in.nextLong();
        final long e = in.nextLong();

        long minSum = 0;
        long maxSum = 0;

        final long[] arr = {a, b, c, d, e};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[i + 1];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
