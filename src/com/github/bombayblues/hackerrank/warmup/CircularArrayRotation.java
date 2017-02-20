package com.github.bombayblues.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * John Watson performs an operation called a right circular rotation on an array of integers, . After performing one right circular rotation operation, the array is transformed from  to .
 * <p>
 * Watson performs this operation  times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks  queries, where each query consists of a single integer, , for which you must print the element at index  in the rotated array (i.e., the value of ).
 * <p>
 * Input Format
 * <p>
 * The first line contains  space-separated integers, , , and , respectively.
 * The second line contains  space-separated integers, where each integer  describes array element  (where ).
 * Each of the  subsequent lines contains a single integer denoting .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * For each query, print the value of the element at index  of the rotated array on a new line.
 * <p>
 * Sample Input 0
 * <p>
 * 3 2 3
 * 1 2 3
 * 0
 * 1
 * 2
 * Sample Output 0
 * <p>
 * 2
 * 3
 * 1
 * Explanation 0
 * <p>
 * After the first rotation, the array becomes .
 * After the second (and final) rotation, the array becomes .
 * <p>
 * Let's refer to the array's final state as array . For each query, we just have to print the value of  on a new line:
 * <p>
 * , so we print  on a new line.
 * , so we print  on a new line.
 * , so we print  on a new line.
 */
public class CircularArrayRotation {

    public static void main(final String[] args) {
        final Scanner stdin = new Scanner(System.in);
        final int n = stdin.nextInt();
        final int k = stdin.nextInt();
        final int q = stdin.nextInt();
        final List<Integer> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            numbers.add(stdin.nextInt());
        }
        final int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = stdin.nextInt();
        }
        final int rotationPos = k % n;
        final List<Integer> part1 = numbers.subList(0, numbers.size() - rotationPos);
        final List<Integer> part2 = numbers.subList(numbers.size() - rotationPos, numbers.size());
        final List<Integer> finalList = new ArrayList<>(part2);
        finalList.addAll(part1);

        for (int i = 0; i < q; i++) {
            System.out.println(finalList.get(queries[i]));
        }
        stdin.close();
    }
}