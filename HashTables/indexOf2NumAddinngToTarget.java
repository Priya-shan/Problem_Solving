/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author welcom
 */
public class indexOf2NumAddinngToTarget {
    public static void main(String args[]){
        int[] arr={4,1,4,7,9};
        ArrayList<Integer> lst=new ArrayList<>();
        int k=8;
        
        Set<Integer> set=new HashSet<>();
        for(int el:arr){
            set.add(el);
        }
        int a=0,b=0;
        for(int el:arr){
            if(set.contains(k-el)){
                a=el;
                b=k-el;
                break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a || arr[i]==b){
                lst.add(i);
            }
            
        }
        System.out.println(lst);
    }
}
