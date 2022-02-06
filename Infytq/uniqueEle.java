/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.io.*;
import java.util.HashSet;
import java.util.*;

/**
 *
 * @author welcom
 */
    public class uniqueEle {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
            n = Integer.parseInt(br.readLine());
        String strArr[] = br.readLine().split(",");
        int len = strArr.length;
        System.out.println(Arrays.toString(strArr));
        HashSet < Integer > hs = new HashSet < > ();
        for (int i = 0; i < len; i++) {
            hs.add(Integer.parseInt(strArr[i]));
            System.out.println(hs);
        }
        System.out.println(hs);
        System.out.println(hs.size() - n);
    }
}

