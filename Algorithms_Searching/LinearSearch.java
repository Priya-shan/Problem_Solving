/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Searching;

/**
 *
 * @author welcom
 */
public class LinearSearch {
    public void search(int[] arr,int k){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Element "+k+" is found at position : "+i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
