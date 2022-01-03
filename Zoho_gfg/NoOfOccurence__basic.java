/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author welcom
 */
public class NoOfOccurence__basic {
     public static void main(String args[]){
        NoOfOccurenceSolution obj=new NoOfOccurenceSolution();
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        System.out.println(obj.count(arr,arr.length,2));
    }
}
class NoOfOccurenceSolution{
    int count(int[] arr, int n, int x) {
        // code here
        Map<Integer,Integer> hmap=new HashMap<>();
        int count;
        for(int i:arr){
            count=hmap.containsKey(i)?hmap.get(i):0;
            hmap.put(i,count+1);
            /*if(hmap.containsKey(i)){
                hmap.put(i,hmap.get(i)+1);
            }
            else{
                hmap.put(i,1);
            }*/
        }
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            if(entry.getKey()==x){
                return entry.getValue();
            }
        }
        return 0;
    }
}