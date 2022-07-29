/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techgig;

import java.io.*;
import java.util.*;

public class shop_circular_queue {

    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int n = sc.nextInt();
        int[] d = new int[n];
        int[] s = new int[n];
        String str;
        String[] sarr;
        for (int i = 0; i < n; i++) {
            str = sc.next();
            sarr = str.split(" ");
            d[i] = Integer.parseInt(sarr[0]);
            s[i] = Integer.parseInt(sarr[1]);
        }
        int wchrg = n * 10;
        int schrg = 0;
        int[] trans = new int[n];
        for (int i = 0; i < n; i++) {
            trans[i] = s[i] - d[i];
        }
        int curr = 0;
        int prev = n - 1;
        int nxt = curr + 1;
        System.out.println(Arrays.toString(trans));
        System.out.println(arrsum(trans));
        int t = 10;
        while (arrsum(trans)) {
            System.out.println("c " + curr);
            System.out.println("p " + prev);
            System.out.println("n " + nxt);
            System.out.println("enterd while");
            int distTrav = 0;
            int amtTrans = 0;
            if (trans[curr] > 0) {
                System.out.println("entered main if (curr>0)");
                if (trans[prev] < 0 || trans[nxt] < 0) {
                    System.out.println("entered submain if (any one(prev/nxt)<0)");
                    int f = findSmaller(trans[prev], trans[nxt]);
                    if (f == -1) {
                        System.out.println("entered 1 if (prev smaaller)");
                        amtTrans = Math.abs(trans[prev]);
                        if (trans[curr] >= amtTrans) {
                            trans[curr] = trans[curr] - amtTrans;
                            trans[prev] = 0;
                        } else {
                            amtTrans = trans[curr];
                            trans[prev] = trans[prev] + trans[curr];
                            trans[curr] = 0;

                        }
                        distTrav++;
                    } else if (f == 1) {
                        System.out.println("entered 1 if (next smaaller)");
                        amtTrans = Math.abs(trans[nxt]);
                        if (trans[curr] >= amtTrans) {
                            trans[curr] = trans[curr] - amtTrans;
                            trans[nxt] = 0;
                        } else {
                            amtTrans = trans[curr];
                            trans[nxt] = trans[nxt] + trans[curr];
                            trans[curr] = 0;
                        }
                        distTrav++;
                    }
                } else if (trans[prev] == 0 || trans[nxt] == 0) {
                    int pc = 0;
                    int nc = 0;
                    while (trans[prev] < 0) {
                        pc++;
                        prev = curr - 1;
                        prev = prev % n;
                    }
                    while (trans[nxt] < 0) {
                        nc++;
                        nxt = curr + 1;
                        nxt = nxt % n;
                    }
                    
                    if(pc<nc){
                       schrg +=  (trans[curr]*(pc+1));
                       System.out.println("----------"+schrg);
                       return;
                    }
                    else{
                       schrg += ( trans[curr]*(nc+1));
                       System.out.println("----------"+schrg);
                       return;
                    }
                }
            }
            schrg += (distTrav * amtTrans);
            System.out.println(Arrays.toString(trans));
            System.out.println("***"+schrg);
            //t--;
            if (trans[curr] > 0 && trans[nxt] != 0) {
                continue;
            }
            curr = curr + 1;
            prev = curr - 1;
            nxt = curr + 1;

            curr = curr % n;
            prev = prev % n;
            nxt = nxt % n;
        }

        // System.out.println(Arrays.toString(d));
        //System.out.println(Arrays.toString(s));
        //System.out.println(Arrays.toString(trans));
        int tchrg = wchrg + schrg;
        System.out.println(tchrg);
    }

    public static boolean arrsum(int[] trans) {
        for (int i : trans) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public static int findSmaller(int prev, int next) {
        if (prev < 0 && next < 0) {
            if (Math.abs(prev) < Math.abs(next) && prev != 0) {
                return -1;
            } else if (Math.abs(next) < Math.abs(prev) && next != 0) {
                return 1;
            }
        } else if (prev >= 0 || next >= 0) {
            if (prev >= 0) {
                return 1;
            } else if (next >= 0) {
                return -1;
            }
        } else {
            return 0;
        }
        return -0;
    }
}
