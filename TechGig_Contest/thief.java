/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechGig_Contest;

import java.io.*;
import java.util.*;
public class thief {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc=new Scanner(System.in);
   int ag_loc=sc.nextInt();
   int hops=sc.nextInt();
   // System.out.println(ag_loc+" "+hops);

   int n=sc.nextInt();
   // System.out.println(n);
   int[] c_time_arr=new int[n];
   for(int i=0;i<n;i++){
      c_time_arr[i]=sc.nextInt();
   }

   int[] c_loc_arr=new int[n];
   for(int i=0;i<n;i++){
      c_loc_arr[i]=sc.nextInt();
   }
   int locmax=Integer.MIN_VALUE;
   for(int i:c_loc_arr){
      if(i>locmax)
         locmax=i;
   }
   int[] area=new int[locmax];
   int coploc=ag_loc;
   //area[coploc]=1;
   int cnt=0;
   for(int i=0;i<=n;i++){
      for(int j=0;j<c_time_arr.length;j++){
         if(i+1==c_time_arr[j]){
            int crimloc=c_loc_arr[j];
            if(Math.abs(coploc-crimloc)<=hops){
               cnt++;
               coploc=crimloc;
            }
            break;
         }
      }
   }
   // System.out.println("**"+cnt);
   System.out.println(n-cnt);
   // System.out.println(Arrays.toString(c_time_arr));
   // System.out.println(Arrays.toString(c_loc_arr));
   // System.out.println(Arrays.toString(area));
   
   
   }
}
