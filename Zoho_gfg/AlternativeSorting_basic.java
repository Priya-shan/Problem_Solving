/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.*;

/**
 *
 * @author welcom
 */
public class AlternativeSorting_basic {
     public static void main(String args[]){
        AlternativeSortingSolution obj=new AlternativeSortingSolution();
        ArrayList<Long> lst=new ArrayList<>();
        long[] arr={7, 1, 2, 3, 4, 5, 6};
        lst=obj.alternateSort(arr,arr.length);
        System.out.println(lst);
    }
}
class AlternativeSortingSolution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        ArrayList<Long> lst=new ArrayList<>();
        long[] temp=Arrays.copyOf(arr, N);
        
        Arrays.sort(temp);
        int flag=0;
        int asccnt=0;
        int desccnt=temp.length-1;
        
        for(int i=0;i<arr.length;i++){
            
            if(flag==0){
                lst.add(temp[desccnt--]);
                //arr[i]=temp[desccnt--];
                flag=1;
                continue;
            }
            if(flag==1){
                lst.add(temp[asccnt++]);
                //arr[i]=temp[asccnt++];
                flag=0;
                continue;
            }
        }
        //System.out.println(Arrays.toString(arr));
        return lst;
    }
}
