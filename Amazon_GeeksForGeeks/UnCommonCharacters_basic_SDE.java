/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_GeeksForGeeks;

import java.util.*;
import java.io.*;
/**
 *
 * @author welcom
 */
public class UnCommonCharacters_basic_SDE {
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution_UnCommonCharacters_basic_SDE ob = new Solution_UnCommonCharacters_basic_SDE();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
class Solution_UnCommonCharacters_basic_SDE
{
    String UncommonChars(String A, String B)
    {
        
        for(int i=0;i<A.length();i++){
            
        }
        // code here
        String res="";
        for(char c1:A.toCharArray()){
            if(isnotpresentinB(c1,B)){
                res+=""+c1;
            }
        }
        for(char c1:B.toCharArray()){
            if(isnotpresentinA(c1,A)){
                res+=""+c1;
            }
        }
        HashSet<Character> hset=new HashSet<>();
        for(char c:res.toCharArray()){
            hset.add(c);
        }
        res="";
        char[] arr=new char[hset.size()];
        int idx=0;
        for(char c:hset){
            arr[idx++]=c;
        }
        Arrays.sort(arr);
        res="";
        for(char c:arr){
            res+=""+c;
        }
        if(res.length()==0){
            return "-1";
        }
        return res;
        
    }
    public boolean isnotpresentinB(char ch,String b){
        for(char c:b.toCharArray()){
            if(c==ch){
                return false;
            }
        }
        return true;
    }
    public boolean isnotpresentinA(char ch,String a){
        for(char c:a.toCharArray()){
            if(c==ch){
                return false;
            }
        }
        return true;
    }
    
}