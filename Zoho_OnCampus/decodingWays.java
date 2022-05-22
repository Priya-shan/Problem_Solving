/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class decodingWays {
    public static void main (String[] args) {
		//code
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
while(t-->0)
{
    int n=sc.nextInt();
    String a=sc.next();
    int T[] = new int[n +1];
		
		T[0] = T[1] = 1;
		if (a.charAt(0) == '0')
			T[1] = 0;
		
		for (int i = 2; i <= n; i++){
			T[i] = 0;
			if (a.charAt(i -1) > '0')
				T[i] = T[i -1];
			
			if (a.charAt(i-2)=='1'||  (a.charAt(i -2) <= '2' && a.charAt(i -1) < '7'))
				T[i] = T[i] + T[i -2]; 
			
		}
	System.out.println(T[n]);	
}
	}
}
