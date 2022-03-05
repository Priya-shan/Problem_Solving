/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.*;

/*
4.print the max sum of continuous positive numbers and also the
elements in an array
array{-8,11,15,-10,12,17,19,-1}
output: max sum=48 elements={12,17,19}
array{1,-8,7,8,9,-10,30,-11}
output: max sum=30 elements={30}
 */
public class MaxSum {
    public static void main(String args[]){
      MaxSumSolution obj=new MaxSumSolution();
        int[] arr={-8,11,15,-10,12,17,19,-1};
        obj.find(arr);
    }
}
class MaxSumSolution{
    public void find(int[] arr){
        Map<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int max=0;
        int reachedEnd=0;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            int sum=0;
            if(arr[i]<0){
                
                continue;
            }
            cnt++;
            sum+=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<0){
                    if(j==arr.length-1){
                        reachedEnd=1;
                    }
                    break;
                }
                sum+=arr[j];
                cnt++;
                if(j==arr.length-1){
                        reachedEnd=1;
                    }
                
            }
            if(max<sum){
                max=sum;
                hmap.clear();
                hmap.put(i,cnt);
            }
            if(reachedEnd==1){
                break;
            }
        }
        //System.out.println(hmap);
        System.out.println("max sum="+max);
        int startIndex=0;
        int length=0;
       for(Map.Entry<Integer,Integer> pair:hmap.entrySet()){
            startIndex=pair.getKey();
            length=pair.getValue();
        }
       List<Integer> lst=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(i==startIndex){
               for(int j=i;j<i+length;j++){//4 7
               lst.add(arr[j]);
               }
               break;
           }
       }
        System.out.println("elements="+lst);
        //return 0;
    }
}