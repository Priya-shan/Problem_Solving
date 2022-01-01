/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author welcom
 */
public class MostRepeatedElement {
    public static void main(String args[]){
     int count;
     int[] arr={1,2,2,3,2,5,6,5,5,5,7,5};
     
     Map<Integer, Integer> hmap=new HashMap<>();
     for(int el:arr){
        count=hmap.containsKey(el)? hmap.get(el):0;
        hmap.put(el,count+1);
     }
     int max=0;
     int res=-1;
     for(int el:arr){
         if(hmap.get(el)>max){
             max=hmap.get(el);
             res=el;
         }
     }
        System.out.println(res);
     
     
     
    }
}
