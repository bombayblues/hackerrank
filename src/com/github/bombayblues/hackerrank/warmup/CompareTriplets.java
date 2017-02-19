package com.github.bombayblues.hackerrank.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets?h_r=next-challenge&h_v=zen
 * <p>
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
 * <p>
 * We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
 * <p>
 * Your task is to find their comparison scores by comparing  with ,  with , and  with .
 * <p>
 * If , then Alice is awarded  point.
 * If , then Bob is awarded  point.
 * If , then neither person receives a point.
 * Given  and , can you compare the two challenges and print their respective comparison points?
 * <p>
 * Input Format
 * <p>
 * The first line contains  space-separated integers, , , and , describing the respective values in triplet .
 * The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
 * <p>
 * Sample Input
 * <p>
 * 5 6 7
 * 3 6 10
 * Sample Output
 * <p>
 * 1 1
 * Explanation
 * <p>
 * In this example:
 * <p>
 * Now, let's compare each individual score:
 * <p>
 * , so Alice receives  point.
 * , so nobody receives a point.
 * , so Bob receives  point.
 * Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
 */

public class CompareTriplets {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int a0 = in.nextInt();
        final int a1 = in.nextInt();
        final int a2 = in.nextInt();
        final int b0 = in.nextInt();
        final int b1 = in.nextInt();
        final int b2 = in.nextInt();

        int alice = 0;
        int bob = 0;

        if (a0 > b0) {
            alice++;
        } else if (a0 < b0) {
            bob++;
        }

        if (a1 > b1) {
            alice++;
        } else if (a1 < b1) {
            bob++;
        }

        if (a2 > b2) {
            alice++;
        } else if (a2 < b2) {
            bob++;
        }

        System.out.print(alice + " " + bob);
    }
}
