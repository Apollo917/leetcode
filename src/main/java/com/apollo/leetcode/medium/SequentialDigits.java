package com.apollo.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 1291. Sequential Digits
 * <p>
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 * @see <a href="https://leetcode.com/problems/sequential-digits/">Sequential Digits<a/>
 */
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        final String sequence = "123456789";

        int lowWindowWidth = String.valueOf(low).length();
        int highWindowWidth = String.valueOf(high).length();

        for (int currentWidth = lowWindowWidth; currentWidth <= highWindowWidth; currentWidth++) {
            for (int offset = 0; offset + currentWidth <= sequence.length(); offset++) {
                int value = Integer.parseInt(sequence.substring(offset, offset + currentWidth));

                if (value >= low && value <= high) {
                    result.add(value);
                }
            }
        }

        return result;
    }
}
