/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

/**
 *
 * @author welcom
 */
public class Q1_CountMazePaths {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int cnt=count(m,n);
        System.out.println(cnt);
    }
    public static int count(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return count(m-1,n)+count(m,n-1);
        
    }
}
