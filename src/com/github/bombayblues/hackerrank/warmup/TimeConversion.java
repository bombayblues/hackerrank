package com.github.bombayblues.hackerrank.warmup;

import java.util.Scanner;

/**
 * Given a time in -hour AM/PM format, convert it to military (-hour) time.
 * <p>
 * Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.
 * <p>
 * Input Format
 * <p>
 * A single string containing a time in -hour clock format (i.e.:  or ), where  and .
 * <p>
 * Output Format
 * <p>
 * Convert and print the given time in -hour format, where .
 * <p>
 * Sample Input
 * <p>
 * 07:05:45PM
 * Sample Output
 * <p>
 * 19:05:45
 */
public class TimeConversion {

    public static void main(final String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        final Scanner stdin = new Scanner(System.in);
        final String input = stdin.nextLine();
        final int hours = Integer.parseInt(input.substring(0, input.indexOf(':')));
        final int minutes = Integer.parseInt(input.substring(input.indexOf(':') + 1, input.lastIndexOf(':')));
        final int seconds = Integer.parseInt(input.substring(input.lastIndexOf(':') + 1, input.lastIndexOf(':') + 3));
        final int newHours;
        if (hours == 12) {
            newHours = 0;
        } else {
            newHours = hours;
        }
        final int shift;
        if (input.toLowerCase().contains("pm")) {
            shift = 12;
        } else {
            shift = 0;
        }
        System.out.println(String.format("%02d:%02d:%02d", (newHours + shift), minutes, seconds));

    }

}
