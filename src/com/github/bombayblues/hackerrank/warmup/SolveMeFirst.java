package com.github.bombayblues.hackerrank.warmup;


import java.util.Scanner;

/**
 * <b>Input Format</b>
 * <p>
 * Code that reads input from stdin is provided for you in the editor. There are  lines of input, and each line contains a single integer.
 * <p>
 * <b>Output Format</b>
 * <p>
 * Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor.
 */

public class SolveMeFirst {

    static int solveMeFirst(final int a, final int b) {
        // Hint: Type return a+b; below
        return a + b;
    }


    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int a;
        a = in.nextInt();
        final int b;
        b = in.nextInt();
        final int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
