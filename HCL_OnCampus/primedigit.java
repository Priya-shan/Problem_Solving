/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCL_OnCampus;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class primedigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int cnt=0;
        for(int i=l;i<=r;i++){
            if(isPrime(Integer.toString(i))){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(String s){
        ArrayList<String> primes=new ArrayList<>();
        primes.add("2");
        primes.add("3");
        primes.add("5");
        primes.add("7");
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(primes.contains(""+s.charAt(i))){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
        
    }
            
}
