/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SurveySparrow_Oncampus;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int[] arr=solu(5,10);
        System.out.println(Arrays.toString(arr));
    }
    static int[] solu(int K,int T){
        int[] result=new int[2];
        ArrayList<Integer> lst=new ArrayList<>();
        recurr(K,T,1,2,lst,0);
        int idx=0;
        for(int i:lst){
            result[idx++]=i;
        }
        return result;
    }
    static void recurr(int K,int T,int a,int b,ArrayList<Integer> lst,int cnt){
        if(cnt==T){
            lst.add(a);
            lst.add(b);
            return;
        }
        int temp=(K*b+a*a)%3001;
        b=(K*a+b)%3001;
        a=temp;
        recurr(K,T,a,b,lst,cnt+1);
    }
}
