/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Arrays;

/**
 *------------------------------------To Be Done-----------------------------------------------
 * @author welcom
 */
public class MinNumByAtmostSwaps {

    public static void main(String[] args) {
        // input number
        String s = "934651";
        int k = 2;

        String min = findMinimum(s, k);

        System.out.println("The minimum number formed by doing at-most "
                + k + " swaps is " + min);
    }
    // Wrapper over findMin() function
     public static String findMinimum(String s, int k) {
        // base case
        if (s == null || s.length() == 0) {
            return s;
        }

        // convert digits of a given integer to a char array to
        // facilitate operations on them
        char[] digits = s.toCharArray();
        return findMin(digits, k, s);
    }

    // Find the minimum number formed by doing at-most `k` swap operations upon
    // digits of the string
    public static String findMin(char[] digits, int k, String min_so_far) {
        // compare the current number with a minimum number so far
        String curr = new String(digits);
        System.out.println("current "+curr);
        if (curr.compareTo(min_so_far) < 0) {
            min_so_far = curr;
        }

        // base case: no swaps left
        if (k < 1) {
            return min_so_far;
        }

        // do for each digit in the input string
        for (int i = 0; i < digits.length - 1; i++) {
            // compare the current digit with the remaining digits
            for (int j = i + 1; j < digits.length; j++) {
                // if the digit at i'th index is more than the digit
                // at j'th index
                if (digits[i] > digits[j]) {
                    // swap `digits[i]` with `digits[j]`
                    swap(digits, i, j);
                    System.out.println("swap "+Arrays.toString(digits));
                    // recur for remaining `k-1` swap
                    min_so_far = findMin(digits, k - 1, min_so_far);

                    // backtrack: restore the array
                    swap(digits, i, j);
                    System.out.println("backtrack: restore the array"+Arrays.toString(digits));
                }
            }
        }
        return min_so_far;
    }
    
    private static void swap(char[] digits, int i, int j) {
        char digit = digits[i];
        digits[i] = digits[j];
        digits[j] = digit;
    }
}
