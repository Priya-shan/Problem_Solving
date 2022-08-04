/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Q3_DiagonalMazePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
         ArrayList<String> res=new ArrayList<>();
        res=printt(m, n, "");
        System.out.println(res);
    }

    public static ArrayList<String> printt(int m, int n, String str) {
        if (m == 1 && n==1) {
            ArrayList<String> lst=new ArrayList<>();
            lst.add(str);
            System.out.println(str);
            return lst;
        }
        ArrayList<String> lst=new ArrayList<>();
        if(m>0)
            lst.addAll(printt(m - 1, n, str + "D"));
        if(m>1 && n>1)
            lst.addAll(printt(m - 1, n-1, str + "G"));
        if(n>0)
            lst.addAll(printt(m, n - 1, str + "R"));
        return lst;
    }
}
