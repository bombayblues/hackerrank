package com.github.bombayblues.hackerrank.warmup;


import java.util.Scanner;

/**
 * Given an array of  integers, can you find the sum of its elements?
 * <p>
 * <b>Input Format</b>
 * <p>
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers representing the array's elements.
 * <p>
 * <b>Output Format</b>
 * <p>
 * Print the sum of the array's elements as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 6
 * 1 2 3 4 10 11
 * Sample Output
 * <p>
 * 31
 * Explanation
 * <p>
 * We print the sum of the array's elements, which is: .
 */

public class SimpleArraySum {
    public static void main(final String[] args) {
        final Scanner stdin = new Scanner(System.in);
        final int n = stdin.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stdin.nextInt();
        }
        System.out.println(sum);
    }
}
