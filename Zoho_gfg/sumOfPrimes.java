/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcom
 */
public class sumOfPrimes {

    public static void main(String args[]) {
        sumOfPrimesSolution obj = new sumOfPrimesSolution();
        System.out.println(obj.primeSum(10));
    }

    static class sumOfPrimesSolution {

        static int primeSum(int N) {
            List <Integer> lst=new ArrayList<>();
            int rem;
            while (N > 0) {
                rem = N % 10;
                if(isPrime(rem))
                    lst.add(rem);
                N = N / 10;
            }
            int sum=0;
            for(int i:lst)
                sum=sum+i;

            return sum;
        }

        static boolean isPrime(int n) {
            if(n<2)
                return false;
            int i=2;
            while(i<n){
                if(n%i++==0)
                    return false;
            }
            return true;
        }
    }
}
