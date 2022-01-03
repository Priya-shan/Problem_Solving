/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

/**
 *
 * Reverse and add until count is less than 5.
 */
public class SumPalindrome__school {

    public static void main(String args[]) {
        isSumPalindromeSolution obj = new isSumPalindromeSolution();
        System.out.println(obj.isSumPalindrome(9772));
    }
}

class isSumPalindromeSolution {

    static long isSumPalindrome(long n) {
        // code here
        int count = 0;
        long rev;
        while (!isPalindrome(n) && count <5) {
            System.out.println(n);
            rev = reverse(n);
            n += rev;
            count++;
            System.out.println("n : "+n+" rev : "+rev+ " count : "+count);

        }
        if (isPalindrome(n)) {
            return n;
        } else {
            return -1;
        }
    }

    static boolean isPalindrome(long n) {
        if (n == reverse(n)) {
            return true;
        }
        return false;
    }

    static long reverse(long n) {
        String rev = "";
        long rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            rev += rem;
        }
        //System.out.println((long)Integer.parseInt(rev));
        return (long) Integer.parseInt(rev);
    }
}
