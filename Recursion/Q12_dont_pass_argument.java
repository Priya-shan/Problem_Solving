/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Q12_dont_pass_argument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,18,1,85,99,85};
        int k=sc.nextInt();
        //System.out.println(check(arr,0,k));
        System.out.println(check_mulitiple_idx2(arr,0,k));
    }
    public static ArrayList<Integer> check_mulitiple_idx2(int[] arr,int idx,int k){
        ArrayList<Integer> lst=new ArrayList<>();
        if(idx==arr.length){
            return lst;
        }
        if(arr[idx]==k){
            lst.add(idx);
        }
        ArrayList<Integer> list_from_below = check_mulitiple_idx2(arr,++idx,k);
        lst.addAll(list_from_below);
        return lst;
        
    }
}
