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
public class Q11_linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<>();
        int[] arr={12,18,1,85,99,85};
        int k=sc.nextInt();
        //System.out.println(check(arr,0,k));
        System.out.println(check_mulitiple_idx(arr,0,k,lst));
    }
    public static int check(int[] arr,int idx,int k){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==k){
            return idx;
        }
        return check(arr,++idx,k);
        
    }
    public static ArrayList<Integer> check_mulitiple_idx(int[] arr,int idx,int k,ArrayList<Integer> lst){
        if(idx==arr.length){
            if(lst.size()==0){
                lst.add(-1);
            }
            return lst;
        }
        if(arr[idx]==k){
            lst.add(idx);
        }
        return check_mulitiple_idx(arr,++idx,k,lst);
        
    }
}
