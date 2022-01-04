/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author welcom
 */
public class SearchPatternZAlgorithm {
    public static void main(String args[]){
        SearchPatternZAlgorithmSolution obj=new SearchPatternZAlgorithmSolution();
        System.out.println(obj.search("dxfi","aylnlfdxfi"));
    }
}
class SearchPatternZAlgorithmSolution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList <Integer> lst=new ArrayList<>();
        String s=pat+"$"+S;
        int[] arr=new int[s.length()];
            arr=getZarray(arr,s,pat);
            for(int k=0;k<arr.length;k++){
                if(arr[k]==pat.length())
                    lst.add((k-pat.length()+1)-1);
            }
        
        return lst;
    }
    int[] getZarray(int[] arr, String s, String pat){
        int index=0;
        int i=0;
            for(int j=i;j<s.length();j++){
                //System.out.println("i j "+i+" "+j);
                if(j<pat.length()+1){
                    arr[index++]=0;
                    //System.out.println(Arrays.toString(arr));
                }
                else{
                    int c=0;
                    int c1=i;
                    int c2=j;
                    //System.out.println("c1 c2 -->" +c1+" "+c2);
                    while(s.charAt(c1) == s.charAt(c2)){
                        c++;
                        c1++;
                        c2++;
                        if(c2>=s.length())
                            break;
                    }
                    arr[index++]=c;
                    //System.out.println(Arrays.toString(arr));
                }
            }
            return arr;
    }
}






/* -------------------Initial Approach ------------------------- */
/*
ArrayList<Integer> search(String pat, String S)
    {
        ArrayList <Integer> lst=new ArrayList<>();
        String s=pat+"$"+S;
        int[] arr=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=9;
        }
        //int c=0;
        int index=0;
        int i=0;
            for(int j=i;j<s.length();j++){
                System.out.println("i j "+i+" "+j);
                if(j<pat.length()+1){
                    arr[index++]=0;
                    System.out.println(Arrays.toString(arr));
                }
                /*else if(s.charAt(i) != s.charAt(j)){
                    arr[index++]=0;
                    System.out.println(Arrays.toString(arr));
                }
                 else if(s.charAt(i) == s.charAt(j) && j<s.length()-1 && s.charAt(i+1) != s.charAt(j+1)) {
                        System.out.println("addin lst");
                    arr[index++]=1;
                    //System.out.println(Arrays.toString(arr));
                }
                 
                else if(s.charAt(i) == s.charAt(j) && s.charAt(i+1) != s.charAt(j+1)){
                    arr[index++]=1;
                    System.out.println(Arrays.toString(arr));
                }
                else{
                    int c=0;
                    int c1=i;
                    int c2=j;
                    System.out.println("c1 c2 -->" +c1+" "+c2);
                    while(s.charAt(c1) == s.charAt(c2)){
                        c++;
                        c1++;
                        c2++;
                        if(c2>=s.length())
                            break;
                    }
                    arr[index++]=c;
                    System.out.println(Arrays.toString(arr));
                }
            }
            for(int k=0;k<arr.length;k++){
                if(arr[k]==pat.length()){
                    lst.add((k-pat.length()+1)-1);
                }
            }
        
        return lst;
    }
*/