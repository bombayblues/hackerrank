package com.github.bombayblues.hackerrank.warmup;

import java.util.Scanner;

/**
 * Consider a staircase of size :
 * <p>
 * #
 * ##
 * ###
 * ####
 * Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 * <p>
 * Write a program that prints a staircase of size .
 * <p>
 * Input Format
 * <p>
 * A single integer, , denoting the size of the staircase.
 * <p>
 * Output Format
 * <p>
 * Print a staircase of size  using # symbols and spaces.
 * <p>
 * Note: The last line must have  spaces in it.
 * <p>
 * Sample Input
 * <p>
 * 6
 * Sample Output
 * <p>
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 * Explanation
 * <p>
 * The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
 */
public class Staircase {

    public static void main(final String[] args) {
        final Scanner stdin = new Scanner(System.in);
        final int height = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (height - i - 2 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        stdin.close();
    }
}
