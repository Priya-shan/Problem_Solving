/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.io.*;
import java.util.*;

/**
 *
 * @author welcom
 */
public class Palindromic_Count {

    public static void main(String args[]) throws IOException {
        Palindromic_Count_Solution obj = new Palindromic_Count_Solution();

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine()); //12
        String str = sc.readLine();//abccbaabccba
        int M = Integer.parseInt(sc.readLine()); //1
        String lengths = sc.readLine();
        /*Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int N = sc.nextInt();  //12
        String str = sc.next(); //abccbaabccba
        int M = sc.nextInt(); //1
        String lengths = sc.next(); //6*/
       // System.out.println(lengths);
        String[] strrrr = lengths.split(" ");
         //System.out.println(Arrays.toString(strrrr));
        int[] lengthsArray = new int[lengths.length()];
        for (int i = 0; i < strrrr.length; i++) {
            lengthsArray[i] = Integer.parseInt(strrrr[i]);
        }
        //System.out.println(Arrays.toString(lengthsArray));
        int finalcount = 0;
        //System.out.println(strrrr.length);
        for (int i = 0; i < strrrr.length; i++) {
            int substrlen = lengthsArray[i];
            finalcount += obj.count(N, str, M, substrlen);
        }
        System.out.print(finalcount);

    }
}

class Palindromic_Count_Solution {

    public int count(int N, String str, int M, int substrlen) {
        //pair 6 6 combi
        char[] strarr = str.toCharArray();//[a, b, c, c, b, a, a, b, c, c, b, a]
        int start = 0;
        int end = substrlen;
        int count = 0;
        while (end <= N) {
            String res = "";
            for (int i = start; i < end; i++) {
                res += strarr[i];
                if (res.length() == substrlen) {
                    // System.out.println(res);
                    if (isPalindrome(res)) {
                        count++;
                    }
                    start += 1;
                    end += 1;
                    break;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome(String res) {
        StringBuilder sb = new StringBuilder(res);
        String rev = sb.reverse().toString();
        if (res.equals(rev)) {
            return true;
        }
        return false;
    }
}
