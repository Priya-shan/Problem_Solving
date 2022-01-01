/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;

public class SeiveOfErathonesis {

    public static void main(String[] args) {
        // Write your code here

        int Q, A, B, K, res;
        Scanner sc = new Scanner(System.in);
        Q = sc.nextInt();
        while (Q > 0) {
            A = sc.nextInt();
            B = sc.nextInt();
            K = sc.nextInt();
            
            boolean[] prime = new boolean[B + 1];
            
            findingClosestP obj = new findingClosestP(B, prime);
            
            obj.updateBooleanArray(B, prime);
            res = obj.findP(A, B, K, prime);
            System.out.println(res);

            Q = Q - 1;
        }
    }

}

class findingClosestP {

    findingClosestP(int B, boolean[] prime) {
        for (int i = 2; i <= B; i++) {
            prime[i] = true;
        }
    }

    public void updateBooleanArray(int B, boolean[] prime) {
        for (int i = 2; i < Math.sqrt(B); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= B; j = j + i) {
                    prime[j] = false;
                }
            }
        }
    }

    public int findP(int A, int B, int K, boolean[] prime) {
        int count = 0;
        for (int i = A; i <= B && count <= K; i++) {
            if (prime[i]) {
                count++;
                if (count == K) {
                    return i;
                }
            }
        }
        return -1;
    }
}
