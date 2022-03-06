/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class minimum_withdrawal {
   public static void main(String args[]){
       minimum_withdrawal_solution obj=new minimum_withdrawal_solution();
       Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] ATM = new int[N];
        for(int j=0;j<N;j++){
            ATM[j]=scan.nextInt();
        }
        int X;
        X=scan.nextInt();
        int result;
        System.out.print(obj.minimumWithdrawal(ATM,X));
       
   } 
}
class minimum_withdrawal_solution{
    public static int minimumWithdrawal(int[] ATM,int X){
        int sum=0;
        for(int i:ATM){
            sum+=i;
        }
        if(X>sum){
            return -1;
        }
        if(X==sum){
            return ATM.length;
        }
        
        int target=sum-X;
        int i=0,j=1;
        int total;
        int max_len=Integer.MIN_VALUE;
        int cur_len;
        while(i<ATM.length && j<ATM.length){
            total=calculatesumfromrange(i,j,ATM);
            if(total<target){
                j=j+1;
            }
            else if(total>target){
                i=i+1;
            }
            else{
                cur_len=j-i+1;
                max_len=Math.max(max_len,cur_len);
                j=j+1;
            }
        }
        if(max_len==0){
            if(ATM.length==sum){
                return ATM.length;
            }
            else{
            return -1;
            }
        }
        return ATM.length-max_len;
    }
    
    public static int calculatesumfromrange(int start,int end,int[] ATM){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=ATM[i];
        }
        return sum;
    }
}