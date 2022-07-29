/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCL;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Combi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        //int k=2;
        int n=sc.nextInt();//5
        String ip=sc.next();//2 4 6 8 10
        int k=sc.nextInt();//2
        String[] sarr=ip.split(" ");
        int[] arr=new int[sarr.length];
        int idx=0;
        for(String s:sarr){
            arr[idx++]=Integer.parseInt(s);
        }
//2
//[2,4,6,8,10]
   //2+     
        int cnt=0;
        for(int i=0;i<arr.length-(k-1);i++){
            int sum=arr[i];
            for(int j=i+1;j<=i+(k-1);j++){
                sum+=arr[j];
            }
            if(sum%2==0){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println(-1);
        }
        else{
        System.out.println(cnt);
        }
    }
}
