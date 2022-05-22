/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_Coding;

import java.io.*;
import java.util.*;


public class Minimum_Value {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int[] arr=new int[A.length];
            int out_ = solve(N, A, 0,arr);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int solve(int N, int[] A, int j,int[] arr){
        if(isdecending(arr) && j!=0){
               return j-1;
           }
           for(int i=0;i<A.length;i++){
               arr[i]=A[i]^j;
           }
           j++;
           return solve(N,A,j,arr);
    }
    static boolean isdecending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}