/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author welcom
 */
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Qn20_phnum_gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String s="";
        for(int i:a){
            s+=i;
        }
        ArrayList<String> lst=new ArrayList<>();
        combi_gfg("",s,lst);
        
        String[] myArray = new String[lst.size()];
        lst.toArray(myArray);
        System.out.println("-"+Arrays.toString(myArray));
        Arrays.sort(myArray);  
        //Arrays.toString(myArray);
        System.out.println("-"+Arrays.toString(myArray));
        System.out.println("-------------------------------------------");
        List<String> res=Arrays.asList(myArray);
        
        lst.clear();
        lst.addAll(res);
        return lst;
    }
    static void combi_gfg(String p,String up,ArrayList<String> lst){
        if(up.length()==0){
            lst.add(p);
            return;
        }
        char ch='a';
        int orgdigit=Integer.parseInt(up.charAt(0)+"");
        if(orgdigit==1){
            combi_gfg(p,up.substring(1),lst);
        }
        else if(orgdigit>1 && orgdigit<7){
        int digit=orgdigit-1;
        for(int i=(digit-1)*3;i<digit*3;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1),lst);
        }
        }
        else if(orgdigit==7){
            for(int i=15;i<19;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1),lst);
        }
        }
        else if(orgdigit==8){
            for(int i=19;i<22;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1),lst);
        }
        }
        else if(orgdigit==9){
            for(int i=22;i<26;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1),lst);
        }
        }
    }
}


