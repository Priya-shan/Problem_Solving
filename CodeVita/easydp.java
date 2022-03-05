/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class easydp {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        sc.useDelimiter("\n");
        int t=sc.nextInt();
        ArrayList<String> res=new ArrayList<>();
        while(t>0){
            int sum=0;
            int n=sc.nextInt();
            String ip = sc.next();
            char[] charr=ip.toCharArray();
            //System.out.println(Arrays.toString(charr));
            for(char ch:charr){
                if(ch!=' '){
                    String el=""+ch;
                    if(el.equals("0")){
                    sum++;
                    }
                    sum+= Integer.parseInt(el);
                    
                }
            }
           // String[] iparr = ip.split(" ");
            //for (int i = 0; i < iparr.length; i++) {
                
            //}
            //System.out.println("sum"+sum);
            int[] dparr=new int[sum];
            int flag=1;
            for(int i=0;i<sum;i++){
                if(flag==1){
                    dparr[i]=1;
                    flag=0;
                    continue;
                }
                else{
                    dparr[i]=0;
                    flag=1;
                    continue;
                }
                
            }
            //System.out.println(Arrays.toString(dparr)); 
            
            if(dparr[sum-1]==1){
               // System.out.println("first");
                res.add("First");
            }
            else{
                res.add("Second");
            }
            t--;
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
