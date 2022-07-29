/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Qn19_phoneNumber_Combi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //combi("",s);
        combi_gfg("",s);
        //System.out.println(subseq_ascii("",s));
    }
    public static void combi(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch='a';
        int digit=Integer.parseInt(up.charAt(0)+"");
        for(int i=(digit-1)*3;i<digit*3;i++){
            combi(p+""+(char)(ch+i),up.substring(1));
        }
    }
    
    
     public static void combi_gfg(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch='a';
        int orgdigit=Integer.parseInt(up.charAt(0)+"");
        if(orgdigit==1){
            combi_gfg(p,up.substring(1));
        }
        else if(orgdigit>1 && orgdigit<7){
        int digit=orgdigit-1;
        for(int i=(digit-1)*3;i<digit*3;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1));
        }
        }
        else if(orgdigit==7){
            for(int i=15;i<19;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1));
        }
        }
        else if(orgdigit==8){
            for(int i=19;i<22;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1));
        }
        }
        else if(orgdigit==9){
            for(int i=22;i<25;i++){
            combi_gfg(p+""+(char)(ch+i),up.substring(1));
        }
        }
    }
}
