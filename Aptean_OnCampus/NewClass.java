/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tcs;

import java.util.Scanner;

/**
 *
 * @author Shanmuga Priya M
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next(); //fmfmmm
        int cnt=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                cnt++;
                i++;
            }
        }
        
        System.out.println(cnt);
      
    }
}
