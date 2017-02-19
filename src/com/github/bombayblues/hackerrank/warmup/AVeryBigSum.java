package com.github.bombayblues.hackerrank.warmup;

import java.util.Scanner;

/**
 * You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.
 * <p>
 * Input Format
 * <p>
 * The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.
 * <p>
 * Output Format
 * <p>
 * Print a single value equal to the sum of the elements in the array.
 * <p>
 * Constraints
 * <p>
 * <p>
 * Sample Input
 * <p>
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * <p>
 * 5000000015
 * Note:
 * <p>
 * The range of the 32-bit integer is .
 * When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.
 */
public class AVeryBigSum {
    public static void main(final String[] args) {
        final Scanner stdin = new Scanner(System.in);
        final int numbers = Integer.parseInt(stdin.nextLine());
        final String[] integers = stdin.nextLine().split(" ");
        long sum = 0;
        for (int i = 0; i < numbers; i++) {
            sum += Long.parseLong(integers[i]);
        }
        System.out.println(sum);
        stdin.close();
    }

}
