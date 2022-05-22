/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accenture_Contest;

import java.io.*;
import java.util.*;


public class SustainableTown {
    public static void main(String[] args) throws IOException {
        long[] A={2,7,8,2,1,10,0};
        int res=Possibility(5,1,A);
        System.out.println(res);
    }
    static int Possibility(int N, int M, long[] A){
       /*
        
        */
        System.out.println(Arrays.toString(A));
        int index=A.length;
        if(A.length==3 && M>0){
            return 1;
        }
       while(M>0){
           for(int i=0;i<index-3;i++){
               if((A[i]>A[i+1] && index>=3 )|| A.length==4){
                   A[i+1]=A[i+1]+A[i+2]+A[i+3];
                   for(int j=i+2;j<A.length-1;j++){
                       A[j]=A[j+1];
                   }
                   for(int j=i+2;j<A.length-1;j++){
                       A[j]=A[j+1];
                   }
                   A[A.length-1]=0;
                   A[A.length-2]=0;
                   index=index-2;
                   break;
               }
           }
           System.out.println(Arrays.toString(A));
           M--;
           }
       if(isascending(A,index)){
           return 1;
       }
       else{
           return 0;
       }
       //
       // return 0;
    
    }
    static boolean isascending(long[] A,int limit){
        for(int i=0;i<limit-1;i++){
            if(A[i]>=A[i+1]){
                return false;
            }
        }
        return true;
    }
    
}