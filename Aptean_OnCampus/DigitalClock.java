/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aptean_OnCampus;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class DigitalClock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s=sc.next();
            System.out.println(solve(n,s));
            t--;
        }
    }
    public static int solve(int Length,String N){
        int cnt=0;
        int[] dp={0,0,0,0,0,0,0};
        HashMap<Integer,String> hmapOn=new HashMap<>();
        hmapOn.put(0,"012345");
        hmapOn.put(1, "12");
        hmapOn.put(2,"01346");
        hmapOn.put(3, "01236");
        hmapOn.put(4,"1256");
        hmapOn.put(5, "02356");
        hmapOn.put(6,"23456");
        hmapOn.put(7,"012");
        hmapOn.put(8, "0123456");
        hmapOn.put(9,"01256");
        HashMap<Integer,String> hmapOff=new HashMap<>();
        hmapOff.put(0,"6");
        hmapOff.put(1, "3456");
        hmapOff.put(2,"25");
        hmapOff.put(3, "45");
        hmapOff.put(4,"034");
        hmapOff.put(5, "14");
        hmapOff.put(6,"01");
        hmapOff.put(7,"3456");
        hmapOff.put(8, "");
        hmapOff.put(9,"34");
        for(char ch:N.toCharArray()){
            int ele=Integer.parseInt(ch+"");
            String s1=hmapOff.get(ele);
            for(int i=0;i<s1.length();i++){
                int idx=Integer.parseInt(s1.charAt(i)+"");
                if(dp[idx]==1){
                    dp[idx]=0;
                    cnt++;
                }
            }
            String s2=hmapOn.get(ele);
            for(int i=0;i<s2.length();i++){
                int idx=Integer.parseInt(s2.charAt(i)+"");
                if(dp[idx]==0){
                    dp[idx]=1;
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
