/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Qn14_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(subseq("",s));
        //System.out.println(subseq_ascii("",s));
    }
    public static ArrayList<String> subseq(String p,String up){
        ArrayList<String> lst=new ArrayList<>();
        if(up.isEmpty()){
            if(p!="")
                lst.add(p);
            return lst;
        }
        ArrayList<String> frombelow1=subseq(p+up.charAt(0),up.substring(1));
        ArrayList<String> frombelow2= subseq(p,up.substring(1));
        lst.addAll(frombelow1);
        lst.addAll(frombelow2);
        return lst;
    }
    
     public static ArrayList<String> subseq_ascii(String p,String up){
        ArrayList<String> lst=new ArrayList<>();
        if(up.isEmpty()){
            lst.add(p);
            return lst;
        }
        ArrayList<String> frombelow1=subseq_ascii(p+up.charAt(0),up.substring(1));
        ArrayList<String> frombelowmid=subseq_ascii(p+(up.charAt(0)+0),up.substring(1));
        ArrayList<String> frombelow2= subseq_ascii(p,up.substring(1));
        lst.addAll(frombelow1);
        lst.addAll(frombelowmid);
        lst.addAll(frombelow2);
        return lst;
    }
}
