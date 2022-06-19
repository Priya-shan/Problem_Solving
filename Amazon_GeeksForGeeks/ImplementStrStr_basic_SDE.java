/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_GeeksForGeeks;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class ImplementStrStr_basic_SDE {
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code her
       for(int i=0;i<=s.length()-x.length();i++){
           //System.out.println("i--------->"+i);
           if(s.charAt(i)==x.charAt(0)){
               int flag=0;
               for(int j=i+1;j<x.length()+i;j++){
             //      System.out.println("j--------->"+j);
                       if(s.charAt(j)!=x.charAt(j-i)){
                          flag=1;
                          break;
                       }
               }
               if(flag==0){
                   return i;
               }
           }
       }
       return -1;
    }
}
	