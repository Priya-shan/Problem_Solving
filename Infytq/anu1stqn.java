/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class anu1stqn {
    public static void main(String args[]){
       soln obj=new soln();
       Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int X=scan.nextInt();
        int Y=scan.nextInt();
        String S=scan.next();
        
        System.out.print(obj.countSubarrays(N,X,Y,S));
       
   } 
}
class soln{
    static int countSubarrays(int N,int X,int Y,String S){
        
         ArrayList<String> lst=new ArrayList<>();
         subseq("",S,lst);
         
         int maincnt=0;
         lst.remove(lst.size()-1);
         System.out.println(lst);
         for(String s:lst){
             int acount=count_a(s);
             int bcount=count_b(s);
             if(acount-bcount>=X && acount-bcount<=Y){
                 maincnt++;
             }
         }
        return maincnt%(10^9+7);
    }
    public static int count_a(String s){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='A'){
                cnt++;
            }
        }
        return cnt;
    }
    public static int count_b(String s){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='B'){
                cnt++;
            }
        }
        return cnt;
    }
    public static ArrayList<String> subseq(String p,String up,ArrayList<String> lst){
    if(up.length()==0){
        lst.add(p);
        return lst;
    }
    char ch=up.charAt(0);
    subseq(p+ch,up.substring(1),lst);
    subseq(p,up.substring(1),lst);
    return lst;
    }
}

//2-1   1-1     2-0     1-0     1-1     0-1     1-0 
//1     0       2       1       0       -1      1