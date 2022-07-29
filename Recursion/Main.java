/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Shanmuga Priya M
 */
import java.util.*;
public class Main {
	static void longestPalSubstr(String str)
	{
		int n = str.length();
		boolean table[][] = new boolean[n][n];
		int maxLength = 1;
		for (int i = 0; i < n; ++i)
			table[i][i] = true;
		int start = 0;
		for (int i = 0; i < n - 1; ++i) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				table[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		}
		for (int k = 3; k <= n; ++k) {
			for (int i = 0; i < n - k + 1; ++i) {
				int j = i + k - 1;
				if (table[i + 1][j - 1]
					&& str.charAt(i) == str.charAt(j)) {
					table[i][j] = true;

					if (k > maxLength) {
						start = i;
						maxLength = k;
					}
				}
			}
		}
		String palin=str.substring(start, start + maxLength);
		if(palin.length()<=2){
		    palin="none";
		}
                
                String res="";
                int i=0;
                for(i=0;i<palin.length();i++){
                    res+=palin.charAt(i);
                    res+=str.charAt(i);
                }
                res+=str.substring(i);
                System.out.println(res);
		
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		String str ="abc";
                
                StringBuffer sb=new StringBuffer(str);
                sb.append("de");
                System.out.println(sb);
                //int[] arrr=new int[6];
                // Arrays.sort(arrr);
                //System.out.println(Arrays.toString(arrr));
                ArrayList<Integer> lst=new ArrayList<>();
                lst.add(99);
                lst.add(33);
                Collections.sort(lst);
               //lst.remove(0);
               ArrayList<Integer> lst2=new ArrayList<>();
               lst2.add(89);
               lst2.addAll(lst);
               System.out.println(lst2.contains(199));
                System.out.println(lst2.get(0));
                System.out.println(lst2);
	}
}
