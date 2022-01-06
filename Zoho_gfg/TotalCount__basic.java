/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

/**
 *
 * @author welcom
 */
public class TotalCount__basic {
     public static void main(String args[]){
        TotalCountSolution obj=new TotalCountSolution();
        int[] arr={5, 8, 10, 13};
        int n=arr.length;
        int k=3;
        System.out.println(obj.totalCount(arr,n,k));
    }
}
class TotalCountSolution{
    int totalCount(int[] arr, int n, int k) {
        int count=0;
        for(int i:arr){
            int ele=i;
            count+=ele/k;
            if(ele%k!=0)
                count++;
        }
        return count;
    }
}