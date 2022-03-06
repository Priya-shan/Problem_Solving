/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class kBig {
    public static void main(String[] args){
        kBig_Solution obj =new kBig_Solution();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int N=scan.nextInt();
        int K=scan.nextInt();
        String ip=scan.next();
        String[] sarr=ip.split(" ");
        int[] arr=new int[sarr.length];
        int index=0;
        for(String s:sarr){
            arr[index++]=Integer.parseInt(s);
        }
        System.out.print(obj.findFutile(K,arr));
    }
}
class kBig_Solution{
    static int findFutile(int k,int[] arr){
        int[] temp=new int[arr.length];
        //System.arraycopy(arr, 0, temp, 0, arr.length);
        int cnt=0;
        int sum=arraySum(arr);
        for(int i=0;i<arr.length;i++){
           // System.arraycopy(arr, 0, temp, 0, arr.length);
            //temp[i]=0;
            //System.out.println(Arrays.toString(temp));
            //if(arraySum(k,temp)>k){
              //  cnt++;
            //}
            if(sum-arr[i]>k){
                cnt++;
            }
        }
        return cnt;
    }
    static int arraySum(int[]arr){
        int sum=0;
    for(int i:arr){
        sum+=i;
    }
    return sum;
    }
}