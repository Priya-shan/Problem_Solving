/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Qn17_subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3};
        int[] p=new int[arr.length];
        subset(p,arr,0,0);
    }
    public static void subset(int[] p,int[] up,int pidx,int upidx){
        if(upidx==up.length-1){
            System.out.println(Arrays.toString(p));
            upidx=upidx-2;
            return;
        }
        subset(p,up,pidx,++upidx);
        p[pidx++]=up[upidx];
        subset(p,up,pidx,++upidx);
        
        
    }
}
