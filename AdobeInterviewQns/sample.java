/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdobeInterviewQns;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class sample {
    public static void main(String args[]){
     int[] arr= {1,2,3,4,5};
     int init=arr[0];
     for(int i=0;i<arr.length-1;i++){ 
         //System.out.print(arr[i]);
         arr[i]=arr[i+1];
          //System.out.print(" "+arr[i]+" ");
     }
     arr[arr.length-1]=init;
        System.out.println(Arrays.toString(arr));
    }
}
