/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aptean;

import java.util.*;

/**
 *
 * @author welcom
 */
public class IncreasingTriplet {
    
}
class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        
        ArrayList<Integer> lst=new ArrayList<>();
        int[] lftmin=new int[n];
        int[] rtmax=new int[n];
        int idx1=0;
        int idx2=0;
        for(int i:arr){
            lftmin[idx1++]=i;
        }
        for(int i:arr){
            rtmax[idx2++]=i;
        }
         for(int i=1;i<n;i++){
             if(lftmin[i-1]<lftmin[i]){
                 lftmin[i]=lftmin[i-1];
             }
         }
         for(int i=n-2;i>=0;i--){
             if(rtmax[i+1]>rtmax[i]){
                 rtmax[i]=rtmax[i+1];
             }
         }
         
         for(int i=0;i<n;i++){
             if(arr.get(i)>lftmin[i] && arr.get(i)<rtmax[i]){
                 lst.add(lftmin[i]);
                 lst.add(arr.get(i));
                 lst.add(rtmax[i]);
                 break;
             }
         }
         return lst;
    }
}
