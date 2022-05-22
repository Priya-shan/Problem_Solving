/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic_Building;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Encrypted_String {
     public static void main(String args[]){
         //assign hashmap
         Map<Character,Integer> hmap=new HashMap<>();
         int cnt=1;
         for(int i=97;i<=122;i++){
             hmap.put((char)i,cnt++);
         }
         //get imput
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         s=s.toLowerCase();
         //store string is list
         String[] sarr=s.split("");
         List<String> slst=new ArrayList<>();
         Collections.addAll(slst, sarr);
         //encrypt
         String toadd;
         for(int i=0;i<slst.size()-1;i=i+2){
             char c=slst.get(i).charAt(0);
             char c1=slst.get(i+1).charAt(0);
             
             if(Character.isAlphabetic(c)&& Character.isAlphabetic(c1)){
                 
                 int ascii=((hmap.get(c)+hmap.get(c1))%26)+96;
                 //if 0 add 0
                 if((hmap.get(c)+hmap.get(c1))%26==0){
                     toadd="0";
                     continue;
                 }
                 char ch=(char)ascii;
                 toadd=""+ch;
                 
             }
             else{
                 continue;
             }
             int pos=i+1;
             slst.add(pos,toadd);
         }
         //convert list to string
         String res="";
         for(String each:slst){
             res+=each;
         }
         System.out.println(res);
     }
}
