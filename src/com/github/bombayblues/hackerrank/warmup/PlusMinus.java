package com.github.bombayblues.hackerrank.warmup;

import java.util.Locale;
import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
 * <p>
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers describing an array of numbers .
 * <p>
 * Output Format
 * <p>
 * You must print the following  lines:
 * <p>
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 * Sample Input
 * <p>
 * 6
 * -4 3 -9 0 4 1
 * Sample Output
 * <p>
 * 0.500000
 * 0.333333
 * 0.166667
 * Explanation
 * <p>
 * There are  positive numbers,  negative numbers, and  zero in the array.
 * The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
 */

public class PlusMinus {
    public static void main(final String[] args) {
        final Scanner stdin = new Scanner(System.in);
        final int n = Integer.parseInt(stdin.nextLine());
        final String[] numbers = stdin.nextLine().split(" ");
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            final int num = Integer.parseInt(numbers[i]);
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) positives / n));
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) negatives / n));
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) zeroes / n));
        stdin.close();
    }
}