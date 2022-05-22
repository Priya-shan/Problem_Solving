/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCompass_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class PatternMatch {
    public static void main(String[] args) {
         String pattern = "abba";
        String[] iparr = {"dog", "cat", "cat", "dog"};
        int[] arr1 = new int[pattern.length()];
        int[] arr2 = new int[pattern.length()];
        char[] ip = pattern.toCharArray();
        int k = 1;
        arr1[0] = 1;
        int flag=0;
        for (int i = 1; i < pattern.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (ip[i] == ip[j]) {
                    flag=1;
                    arr1[i] = arr1[j];
                    break;
                }
               
            }
            if(flag==0){
                    arr1[i] = k+1;
                    k++;
                    //break;
            }
        }
        System.out.println("----------------------");
        arr2[0]=1;
        k=1;
        flag=0;
        for (int i = 1; i < pattern.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (iparr[i].equals(iparr[j])) {
                    flag=1;
                    arr2[i] = arr2[j];
                    break;
                }
               
            }
            if(flag==0){
                    arr2[i] = k+1;
                    k++;
                    //break;
            }
        }
       
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
           
            System.out.println("true");
        }
        else{
           
            System.out.println("false");
        }
    }
}
